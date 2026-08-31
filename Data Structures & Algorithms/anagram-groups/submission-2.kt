class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val hashmap = HashMap<String, MutableList<String>>()

        for (s in strs){
            val key = s.toCharArray().sorted().joinToString("")
            val list = hashmap.getOrPut(key) { mutableListOf()}.add(s)
        }
        return hashmap.values.toList()

    }
}
