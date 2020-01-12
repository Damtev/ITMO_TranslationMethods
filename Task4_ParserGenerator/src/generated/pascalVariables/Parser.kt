package generated.pascalVariables
import java.text.ParseException
import java.util.ArrayDeque

class Parser {

    lateinit var lexer: Lexer
    var text = ""
    

    private fun unexpectedLiteral(rule: String): Nothing =
        throw ParseException("Unexpected literal ${lexer.tokenValue} in rule $rule on pos: ${lexer.curPos}", lexer.curPos)

    private fun check(token: Token, rule: String) {
        if (lexer.token != token) {
            unexpectedLiteral(rule)
        }
    }

    private fun pairPrime(): Node {
        val children = arrayListOf<Node>()
        val res = Node("pairPrime", children)
                    
        when (lexer.token) {
        
        		Token.VAR -> {
			val var0 = start()
			children.add(var0)

res.value.append(var0.value);
			return res
		}
		Token.EOF -> {
if (children.isNotEmpty()) res.value.append(children.last().value);
			children.add(Node("EOF"))
			return res
		}
		Token.NAME -> {
			val var0 = pair()
			children.add(var0)

if (children.isNotEmpty()) res.value.append(children.last().value);
			return res
		}
		else -> {
			unexpectedLiteral("pairPrime")
		}
	}
}

    private fun variablePrime(): Node {
        val children = arrayListOf<Node>()
        val res = Node("variablePrime", children)
                    
        when (lexer.token) {
        
        		Token.COMMA -> {
			check(Token.COMMA, "COMMA")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value.append(text + " ");
			check(Token.NAME, "NAME")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value.append(text);
			val var0 = variablePrime()
			children.add(var0)

res.value.append(var0.value);
			return res
		}
		Token.COLON -> {
			children.add(Node("COLON"))
			return res
		}
		else -> {
			unexpectedLiteral("variablePrime")
		}
	}
}

    private fun start(): Node {
        val children = arrayListOf<Node>()
        val res = Node("start", children)
                    
        when (lexer.token) {
        
        		Token.VAR -> {
			check(Token.VAR, "VAR")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value.append(text + " ");
			val var0 = pair()
			children.add(var0)

res.value.append(var0.value);
			check(Token.EOF, "EOF")
			text = lexer.tokenValue
			children.add(Node("EOF"))

			lexer.nextToken()

			return res
		}
		else -> {
			unexpectedLiteral("start")
		}
	}
}

    private fun variable(): Node {
        val children = arrayListOf<Node>()
        val res = Node("variable", children)
                    
        when (lexer.token) {
        
        		Token.COLON -> {
			children.add(Node("COLON"))
			return res
		}
		Token.NAME -> {
			check(Token.NAME, "NAME")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value.append(text);
			val var0 = variablePrime()
			children.add(var0)

res.value.append(var0.value);
			return res
		}
		else -> {
			unexpectedLiteral("variable")
		}
	}
}

    private fun type(): Node {
        val children = arrayListOf<Node>()
        val res = Node("type", children)
                    
        when (lexer.token) {
        
        		Token.WORD -> {
			check(Token.WORD, "WORD")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value = StringBuilder(text);
			return res
		}
		Token.BYTE -> {
			check(Token.BYTE, "BYTE")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value = StringBuilder(text);
			return res
		}
		Token.LONGINT -> {
			check(Token.LONGINT, "LONGINT")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value = StringBuilder(text);
			return res
		}
		Token.REAL -> {
			check(Token.REAL, "REAL")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value = StringBuilder(text);
			return res
		}
		Token.CHAR -> {
			check(Token.CHAR, "CHAR")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value = StringBuilder(text);
			return res
		}
		Token.STRING -> {
			check(Token.STRING, "STRING")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value = StringBuilder(text);
			return res
		}
		Token.DOUBLE -> {
			check(Token.DOUBLE, "DOUBLE")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value = StringBuilder(text);
			return res
		}
		Token.BOOLEAN -> {
			check(Token.BOOLEAN, "BOOLEAN")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value = StringBuilder(text);
			return res
		}
		Token.INTEGER -> {
			check(Token.INTEGER, "INTEGER")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value = StringBuilder(text);
			return res
		}
		else -> {
			unexpectedLiteral("type")
		}
	}
}

    private fun pair(): Node {
        val children = arrayListOf<Node>()
        val res = Node("pair", children)
                    
        when (lexer.token) {
        
        		Token.EOF -> {
			children.add(Node("EOF"))
			return res
		}
		Token.NAME -> {
			val var0 = variable()
			children.add(var0)

res.value.append(var0.value);
			check(Token.COLON, "COLON")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value.append(text + " ");
			val var1 = type()
			children.add(var1)

res.value.append(var1.value);
			check(Token.SEMICOLON, "SEMICOLON")
			text = lexer.tokenValue
			children.add(Node(text))

			lexer.nextToken()

res.value.append(text + " ");
			val var2 = pairPrime()
			children.add(var2)

res.value.append(var2.value);
			return res
		}
		else -> {
			unexpectedLiteral("pair")
		}
	}
}
    fun parse(input: String): Node {
        lexer = Lexer(input)
        return start()
    }
}