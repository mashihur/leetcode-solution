package string

/*
 * Company : Adobe, Amazon
 * LeetCode Difficulty: easy
 * My Judgement: easy
 */
class L771 {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val set = mutableSetOf<Char>()
        var count = 0

        for (item in jewels) {
            set.add(item)
        }
        for (item in stones) {
            if (set.contains(item)) {
                count++
            }
        }
        return count
    }

//    fun numJewelsInStones(jewels: String, stones: String): Int {
//        return stones.count { it in jewels }
//    }
}