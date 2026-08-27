class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexMap = HashMap<Int,Int>()
        for ( (index , num) in nums.withIndex() ){
            val compliment = target - num
            if(indexMap.containsKey(compliment) && indexMap[compliment] != index){
                return intArrayOf( indexMap[compliment]!!, index)
            }
            
            indexMap[num] = index

        }
        return intArrayOf()
    }
}
