import gen.GoodLanguageGrammarLexer
import gen.GoodLanguageGrammarParser
import org.antlr.runtime.CommonTokenStream
import org.antlr.v4.runtime.CharStreams
import java.io.File

//fun main() {
//    val input = File("src/main/resources/input.txt").readText()
//    val lexer = GoodLanguageGrammarLexer(CharStreams.fromString(input))
//    val parser = GoodLanguageGrammarParser(CommonTokenStream(lexer))
//    val program = parser.program()
//    val visitor = MyGoodLanguageVisitor()
//    File("src/main/resources/output.txt").writeText(visitor.visit(program))
//}