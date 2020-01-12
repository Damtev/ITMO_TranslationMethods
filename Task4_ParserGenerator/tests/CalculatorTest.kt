import generated.calculator.Parser
import org.junit.Test
import org.junit.Assert.assertEquals

class CalculatorTest {

    private val parser by lazy {
        Parser()
    }

    @Test
    fun calculatorTest() {
        val expressions = arrayOf("2 + 2 * 2", "1 + 2 * 3 + 4 - 5", "(1 + 2) * (-(3) * (7 - 4) + 2)", "1 - 2 - 3")
        val answers = arrayOf("6", "6", "-21", "-4")
        for (i in expressions.indices) {
            val node = parser.parse(expressions[i])
            val curAns = "${node.complex}"
            println("${expressions[i]} = $curAns")
            assertEquals(curAns, answers[i])
        }
        println("=".repeat(40))
        val complexTests = arrayOf(
            "2 + 3j",
            "(2 + 3j) * (5 + 4j)",
            "(1 + 2j) + (4 + 3j) + 5",
            "(1 + 3j) * (4 - 2j)",
            "10 + 3 * (2 - 4j) + 10j"
        )
        val complexAnswers = arrayOf(
            "2 + 3j",
            "-2 + 23j",
            "10 + 5j",
            "10 + 10j",
            "16 - 2j"
        )
        for (i in complexTests.indices) {
            val node = parser.parse(complexTests[i])
            val curAns = "${node.complex}"
            println("${complexTests[i]} = $curAns")
            assertEquals(curAns, complexAnswers[i])
        }
    }
}