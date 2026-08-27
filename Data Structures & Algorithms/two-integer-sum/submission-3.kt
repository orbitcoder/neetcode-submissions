class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexMap = HashMap<Int, Int>()
        for ((index, num) in nums.withIndex()){
            indexMap[num]  = index
        }
        for ((index, num) in nums.withIndex()){
            val subvalue = target - num 
            if(indexMap.containsKey(subvalue) && indexMap[subvalue] != index){
                return intArrayOf(index ,indexMap[subvalue]!!)
            }
        
        }
return intArrayOf()

    }
}
