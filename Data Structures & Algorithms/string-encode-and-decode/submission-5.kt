class Solution {

    fun encode(strs: List<String>): String {
        val sb = StringBuilder()
        for (s in strs) {
            sb.append(s.length).append("#").append(s)
        }
        return sb.toString()
    }

    fun decode(str: String): List<String> {
        val res = mutableListOf<String>()
        var i = 0
        while (i < str.length) {
            val j = str.indexOf('#', i)
            val length = str.substring(i, j).toInt()
            res.add(str.substring(j + 1, j + 1 + length))
            i = j + 1 + length
        }
        return res
    }
}
