package bitManipulation

/*
 * Company : Apple, Microsoft
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
class L191kt {
    fun hammingWeight(n:Int):Int {
        var count = 0
        var number = n
        while(number != 0) {
            if  (number % 2 != 0) count++
            number = number ushr 1
        }
        return count
    }
}