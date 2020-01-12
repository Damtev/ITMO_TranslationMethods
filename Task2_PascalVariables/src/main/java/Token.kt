const val VAR_KEYWORD = "var"
val TYPES = hashSetOf("byte", "boolean", "word", "integer", "longint", "real", "double", "char", "string")
val KEY_WORDS: HashSet<String> = hashSetOf(VAR_KEYWORD, *TYPES.toTypedArray())

enum class Token {
    VAR,
    COMMA,
    COLON,
    SEMICOLON,
    NAME,
    TYPE, 
    END
}