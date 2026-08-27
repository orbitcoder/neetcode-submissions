class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val frequencyMap = HashMap<Char,Int>()
        if(s.length != t.length) {
            return false
        }
       for( i in s.indices) {
       val charS = s[i].toChar();
       val charT = t[i].toChar();
        val currentSCount = frequencyMap.getOrDefault(charS, 0)
        frequencyMap[charS] =  currentSCount+1
        val currentTCount = frequencyMap.getOrDefault(charT, 0)
        frequencyMap[charT] = currentTCount -1
        if(frequencyMap[charS]  == 0){
            frequencyMap.remove(charS)
            }
        if(frequencyMap[charT]  == 0){
            frequencyMap.remove(charT)
        }
       }
       println(frequencyMap)
    return frequencyMap.size == 0
    }
}
