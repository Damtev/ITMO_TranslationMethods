package main.ru.ifmo.damtev.generators

import main.ru.ifmo.damtev.MyGrammarTemplateVisitor

fun generateNodeClass(visitor: MyGrammarTemplateVisitor) = buildString {
    append("""
data class Node(val nodeName: String, val children: List<Node> = emptyList()) {
    ${visitor.nodeValues}
}
    """.trimIndent())
}