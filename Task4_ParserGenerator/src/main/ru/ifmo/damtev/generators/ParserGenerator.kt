package main.ru.ifmo.damtev.generators

import main.ru.ifmo.damtev.EOF
import main.ru.ifmo.damtev.EPS
import main.ru.ifmo.damtev.MyGrammarTemplateVisitor
import kotlin.text.Typography.dollar

val SEPARATOR: String = System.lineSeparator()

fun generateParser(visitor: MyGrammarTemplateVisitor) = buildString {
    append(
        """
        import java.text.ParseException
        import java.util.ArrayDeque

        class Parser {

            lateinit var lexer: Lexer
            var text = ""
            ${visitor.attributeValues}

            private fun unexpectedLiteral(rule: String): Nothing =
                throw ParseException("Unexpected literal ${dollar}{lexer.tokenValue} in rule ${dollar}rule on pos: ${dollar}{lexer.curPos}", lexer.curPos)

            private fun check(token: Token, rule: String) {
                if (lexer.token != token) {
                    unexpectedLiteral(rule)
                }
            }

    """.trimIndent()
    )
    for (ruleName in visitor.rules.keys) {
        append(
            """
    private fun ${ruleName}(): Node {
        val children = arrayListOf<Node>()
        val res = Node("$ruleName", children)
                    
        when (lexer.token) {
        
        """
        )
        for (firstToken in visitor.first[ruleName]!!) {
            var varIndex = 0
            val ruleNumber = visitor.ruleNumberFromFirst[ruleName]!![firstToken]!!
            if (firstToken == EPS) {
                for (ruleFollow in visitor.follow[ruleName]!!) {
                    append("\t\tToken.$ruleFollow -> {$SEPARATOR")
                    for (rulePart in visitor.rules[ruleName]!![ruleNumber]) {
                        if (rulePart.startsWith('$')) {
                            append(rulePart.substring(1, rulePart.lastIndex) + SEPARATOR)
                        }
                    }
                    append("\t\t\tchildren.add(Node(\"$ruleFollow\"))$SEPARATOR")
                    append("\t\t\treturn res$SEPARATOR\t\t}$SEPARATOR")
                }
                continue
            }
            append("\t\tToken.$firstToken -> {$SEPARATOR")
            for (rulePart in visitor.rules[ruleName]!![ruleNumber]) {

                if (rulePart.startsWith('$')) {
                    append(rulePart.substring(1, rulePart.lastIndex) + SEPARATOR)
                    continue
                }
                if (rulePart in visitor.tokens.keys) {
                    append("\t\t\tcheck(Token.${rulePart}, \"$rulePart\")$SEPARATOR")
                    append("\t\t\ttext = lexer.tokenValue$SEPARATOR")
                    if (rulePart == EOF) {
                        append("\t\t\tchildren.add(Node(\"EOF\"))$SEPARATOR$SEPARATOR")
                    } else {
                        append("\t\t\tchildren.add(Node(text))$SEPARATOR$SEPARATOR")
                    }
                    append("\t\t\tlexer.nextToken()$SEPARATOR$SEPARATOR")
                } else {
                    append("\t\t\tval var$varIndex = $rulePart()$SEPARATOR")
                    append("\t\t\tchildren.add(var$varIndex)$SEPARATOR$SEPARATOR")
                    ++varIndex
                }
            }

            append("\t\t\treturn res$SEPARATOR")
//                append("\t}$SEPARATOR");
//                append("}$SEPARATOR");

            append("\t\t}$SEPARATOR")
        }
        append("\t\telse -> {$SEPARATOR\t\t\tunexpectedLiteral(\"${ruleName}\")$SEPARATOR\t\t}$SEPARATOR\t}$SEPARATOR}$SEPARATOR")
    }

    append(
        """
        fun parse(input: String): Node {
            lexer = Lexer(input)
            return start()
        }
    }
    """.trimIndent()
    )
}