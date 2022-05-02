package hashMap

/*
 * Company : Facebook, Google
 * LeetCode Difficulty: Medium
 * My Judgement: Medium - Intelligent use of map
 */
class L560 {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var map = HashMap<Int, Int>()
        var sum = 0
        var count = 0
        map[0] = 1

        for (item in nums) {
            sum += item
            count += map[sum - k] ?: 0
            map[sum] = map.getOrDefault(sum,0) + 1
        }
        return count
    }
}