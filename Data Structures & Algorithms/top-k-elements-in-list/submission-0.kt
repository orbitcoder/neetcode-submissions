class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val hashmap = HashMap<Int, Int>()
        for(num in nums){
         hashmap[num]= hashmap.getOrPut(num){0} + 1
        }
        val topKNumbers = hashmap.entries
             .sortedByDescending { it.value }
             .take(k)
             .map { it.key }
        return topKNumbers.toIntArray() //
    }
}
