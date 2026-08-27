class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        print(nums.count)
        for i in 0..<max(0, nums.count - 1) {
            var reqVal = target - nums[i]
          for j in (i + 1)..<max(0, nums.count) {
                if (nums[j]  == reqVal ){
                    return [i,j]
                }
            }  
        }
    return []
    }

}
