import java.text.ParseException

class Parser {

    lateinit var lexer: Lexer
    private lateinit var curToken: Token

    private fun unexpectedLiteral(rule: String): Nothing =
        throw ParseException("Unexpected literal $curToken in rule $rule on pos: ${lexer.curPos}", lexer.curPos)

    private fun check(token: Token, rule: String) {
        if (curToken != token) {
            unexpectedLiteral(rule)
        }
    }

    fun next(token: Token, rule: String) {
        check(token, rule)
        curToken = lexer.nextToken()
    }

    private fun Block() =
        when (curToken) {
            // BLOCK -> var PAIR
            Token.VAR -> {
                curToken = lexer.nextToken()
                Tree("BLOCK", listOf(Tree("var"), Pair()))
            }
            else -> {
                unexpectedLiteral("BLOCK")
            }
        }

    private fun Pair(): Tree =
        when (curToken) {
            // PAIR -> VARIABLE : TYPE ; PAIR'
            Token.NAME -> {
                val v = Variable()
                next(Token.COLON, "PAIR")
                val t = Type()
                next(Token.SEMICOLON, "PAIR")
                val p = PairPrime()
                Tree("PAIR", listOf(v, t, p, Tree(";")))
            }
            // PAIR -> ''
            Token.END -> {
                Tree("PAIR", listOf(Tree("eps")))
            }
            else -> {
                unexpectedLiteral("PAIR")
            }
        }

    private fun PairPrime() =
        when(curToken) {
            // PAIR' -> BLOCK
            Token.VAR -> {
                Tree("PAIR'", listOf(Block()))
            }
            // PAIR' -> PAIR
            Token.NAME -> {
                Tree("PAIR'", listOf(Pair()))
            }
            Token.END -> {
                Tree("PAIR'", listOf(Tree("eps")))
            }
            else -> {
                unexpectedLiteral("PAIR'")
            }
        }

    private fun Variable(): Tree =
        when (curToken) {
            // VARIABLE -> NAME VARIABLE'
            Token.NAME -> {
                val n = Name()
                val vPrime = VariablePrime()
                Tree("VARIABLE", listOf(n, vPrime))
            }
            Token.COLON -> {
                Tree("VARIABLE", listOf(Tree(":")))
            }
            else -> {
                unexpectedLiteral("VARIABLE")
            }
        }

    private fun VariablePrime(): Tree =
        when (curToken) {
            // VARIABLE' -> , NAME VARIABLE'
            Token.COMMA -> {
                curToken = lexer.nextToken()
                Tree("VARIABLE'", listOf(Tree(","), Name(), VariablePrime()))
            }
            Token.COLON -> {
                Tree("VARIABLE'", listOf(Tree(":")))
            }
            else -> {
                unexpectedLiteral("VARIABLE'")
            }
        }

    private fun Name(): Tree =
        when (curToken) {
            // NAME -> [_a-zA-Z][\\w]*
            Token.NAME -> {
                curToken = lexer.nextToken()
                Tree("NAME", listOf(Tree("name")))
            }
            else -> {
                unexpectedLiteral("NAME")
            }
        }

    private fun Type(): Tree =
        when (curToken) {
            // TYPE -> byte | boolean | word | integer | longint | real | double | char | string
            Token.TYPE -> {
                curToken = lexer.nextToken()
                Tree("TYPE", listOf(Tree("type")))
            }
            else -> {
                unexpectedLiteral("TYPE")
            }
        }

    private fun parse(): Tree {
        curToken = lexer.nextToken()
        val tree = Block()
        return if (curToken == Token.END) {
            tree
        } else {
            unexpectedLiteral("End of expression")
        }
    }

    fun parse(input: String): Tree {
        lexer = Lexer(input)
        return parse()
    }
}