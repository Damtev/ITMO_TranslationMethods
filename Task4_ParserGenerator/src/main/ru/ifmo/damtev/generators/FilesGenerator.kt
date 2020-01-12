package main.ru.ifmo.damtev.generators

import main.ru.ifmo.damtev.MyGrammarTemplateVisitor
import java.io.File

const val DIR = "src/generated"

fun generateFiles(visitors: Array<MyGrammarTemplateVisitor>, prefixes: Array<String> = arrayOf("")) {
    File(DIR).deleteRecursively()
    File(DIR).mkdir()
    for ((i, prefix) in prefixes.withIndex()) {
        var path = DIR
        if (prefix.isNotEmpty()) {
            val pack = prefix.substringBefore("Grammar")
            path += "/$pack"
            File(path).mkdir()
        }
        val packageHeader = "package ${path.substringAfter("src/").replace("/", ".")}\n"
        val visitor = visitors[i]
        File("$path/Token.kt").writeText(packageHeader + generateTokenClass(visitor))
        File("$path/Node.kt").writeText(packageHeader + generateNodeClass(visitor))
        File("$path/Lexer.kt").writeText(packageHeader + generateLexer(visitor))
        File("$path/Parser.kt").writeText(packageHeader + generateParser(visitor))
    }
}