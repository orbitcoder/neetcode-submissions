class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       // 5,4,3,6 t= 7
       for (i in 0.. nums.size - 2  ) {
            var numberToFind  = target - nums[i]
           for (j in i+1 .. nums.size - 1 ){
             if(nums[j] == numberToFind){
                return intArrayOf(i,j)
             }
           } 
       }
return intArrayOf()
    }
}
