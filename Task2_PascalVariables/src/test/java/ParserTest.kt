import org.junit.Assert.fail
import org.junit.Test
import java.text.ParseException
import kotlin.random.Random

class ParserTest {

    private val testsSpliterator = "=".repeat(150)
    private val n = 1e3.toInt()

    private val parser by lazy {
        Parser()
    }

    private fun getCorrectFirstCharacter(): Char {
        val chance = Random.nextInt(2)
        return if (chance == 0) {
            '_'
        } else {
            val letter = Random.nextInt(26)
            'a' + letter
        }
    }

    private fun getCorrectCharacter(): Char {
        return when (Random.nextInt(3)) {
            0 -> {
                '_'
            }
            1 -> {
                val letter = Random.nextInt(26)
                'a' + letter
            }
            else -> {
                val digit = Random.nextInt(10)
                '0' + digit
            }
        }
    }

    private fun getCorrectName(len: Int): String {
        var name = ""
        buildString {
            append(getCorrectFirstCharacter())
            for (i in 0 until len - 1) {
                append(getCorrectCharacter())
            }
            if (this.toString() in KEY_WORDS) {
                this[this.length - 1] = '0'
            }
            name = this.toString()
        }

        return name
    }

    private fun correctDeclaration(varsNum: Int, typesNum: Int): String {
        return buildString {
            append("$VAR_KEYWORD ")
            for (i in 0 until typesNum) {
                val vars = mutableListOf<String>()
                for (j in 0 until varsNum) {
                    val varLen = Random.nextInt(1, 4)
                    vars.add(getCorrectName(varLen))
                }
                append(vars.joinToString())
                append(": ")
                append(TYPES.random())
                append("; ")
            }
        }
    }

    private fun correctTest(
        varsNumFrom: Int, varsNumTo: Int, typesNumFrom: Int, typesNumTo: Int,
        blocksNumber: Int = 1,
        testsNumber: Int = n
    ) {
        repeat(testsNumber) {
            val declaration = buildString {
                repeat(blocksNumber) {
                    append(
                        correctDeclaration(
                            Random.nextInt(varsNumFrom, varsNumTo),
                            Random.nextInt(typesNumFrom, typesNumTo)
                        )
                    )
                }
            }
            println(declaration)
            parser.parse(declaration)
        }
        println(testsSpliterator)
    }

    /*@Test
    fun correct_OneVariable_OneType() {
        correctTest(1, 2, 1, 2)
    }*/

    /*@Test
    fun correct_ManyVariables_OneType() {
        correctTest(2, 4, 1, 2)
    }*/

    /*@Test
    fun correct_ManyVariables_ManyTypes() {
        correctTest(2, 4, 2, 4)
    }*/

    @Test
    fun correct_ManyBlocks_ManyVariables_ManyTypes() {
        correctTest(2, 4, 2, 4, blocksNumber = Random.nextInt(2, 4))
    }

    @Test
    fun correctWithDraw() {
        val input = "var a, bd: integer; _c: byte; var f3: longint;"
        Painter.draw(parser.parse(input))
    }

    @Test
    fun incorrect_NameIsKeyword() {
        val incorrect = "var ${KEY_WORDS.random()}: ${TYPES.random()};"
        incorrect.also {
            try {
                parser.parse(it)
                fail(it)
            } catch (e: ParseException) {
                println(it)
            }
        }
        println(testsSpliterator)
    }
}