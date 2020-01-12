package main.ru.ifmo.damtev.generators

import main.ru.ifmo.damtev.MyGrammarTemplateVisitor

fun generateTokenClass(visitor: MyGrammarTemplateVisitor) = buildString {
    append("enum class Token {\n")
    val tokens = arrayListOf<String>()
    for (token in visitor.tokens.keys) {
        tokens.add("\t$token")
    }
    append(tokens.joinToString(",\n"))
    append("\n}")
}