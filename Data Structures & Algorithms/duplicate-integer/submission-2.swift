class Solution {
    func hasDuplicate(_ nums: [Int]) -> Bool {
        var seenNumbers = Set<Int>()

        if(nums.count < 2) { 
            return false 
            }

        for num in nums {
            if seenNumbers.contains(num){
                return true
            }
            seenNumbers.insert(num)
        }
         return false

    }
}
