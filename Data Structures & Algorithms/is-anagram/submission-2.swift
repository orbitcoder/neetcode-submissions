class Solution {
    func isAnagram(_ s: String, _ t: String) -> Bool {
        if s.count != t.count{
            return false
        }
        var frequencyMap = [Character: Int]()

        for (charS , charT) in zip(s, t){
            frequencyMap[charS , default: 0]+=1
            frequencyMap[charT , default: 0]-=1

            if frequencyMap[charS] == 0{
                frequencyMap[charS] = nil
            }
            if frequencyMap[charT] == 0{
                frequencyMap[charT] = nil
            }
        }
        return frequencyMap.isEmpty
       
    }
}
