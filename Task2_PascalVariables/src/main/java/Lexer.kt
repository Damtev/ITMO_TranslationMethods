import java.io.IOException
import java.io.Reader
import java.text.ParseException

class Lexer(private val stream: Reader) {

    constructor(s: String) : this(s.reader())

    var curPos = -1
    private var curChar: Int = -1

    init {
        nextChar()
    }

    private fun isBlank(c: Char): Boolean {
        return c == ' ' || c == '\r' || c == '\t' || c == '\n'
    }

    private fun nextChar() {
        try {
            curChar = stream.read()
        } catch (e: IOException) {
            throw ParseException(e.message, curPos + 1)
        } finally {
            ++curPos
        }
    }

    fun isNameOrTypeSymbol() =
        curChar.toChar().isLetterOrDigit() || curChar.toChar() == '_'

    fun nextToken(): Token {
        while (isBlank(curChar.toChar())) {
            nextChar()
        }

        if (curChar == -1) {
            return Token.END
        }
        val token = StringBuilder(curChar.toChar().toString())
        var isNameOrType = false
        while (isNameOrTypeSymbol()) {
            isNameOrType = true
            nextChar()
            if (isNameOrTypeSymbol()) {
                token.append(curChar.toChar())
            }
        }

        if (!isNameOrType) {
            nextChar()
        }

        val toString = token.toString()
        return when {
            toString == VAR_KEYWORD -> {
                Token.VAR
            }
            toString == "," -> {
                Token.COMMA
            }
            toString == ":" -> {
                Token.COLON
            }
            toString == ";" -> {
                Token.SEMICOLON
            }
            toString in TYPES -> {
                Token.TYPE
            }
            toString.matches("[_a-zA-Z][\\w]*".toRegex()) -> {
                Token.NAME
            }
            else -> {
                throw ParseException("Illegal token $toString", curPos)
            }
        }
    }
}