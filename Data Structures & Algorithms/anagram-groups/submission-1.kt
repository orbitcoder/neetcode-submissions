class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map  = HashMap<String, MutableList<String>>()
        for (word in strs){
            val key = getWordSignature(word)
            map.getOrPut(key){mutableListOf()}.add(word)   
        }
        return map.values.toList()
    }
    fun getWordSignature(word :  String):String{
        val acsiiSignature = IntArray(26)
        for(c in word){
            val intValue  = (c - 'a')
            acsiiSignature[intValue] = acsiiSignature[intValue] + 1
        }
        return acsiiSignature.joinToString(separator = ":")
    }
}
