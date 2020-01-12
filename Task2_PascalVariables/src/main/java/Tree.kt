data class Tree(val value: String, val children: List<Tree> = emptyList()) {

    private fun dfs(indent: Int): String = buildString {
        for (i in 0 until indent) {
            append(" ")
        }
        append(value + "\n")
        for (child in children) {
            dfs(indent + 2)
        }
    }

    fun print(): String {
        return dfs(0)
    }
}