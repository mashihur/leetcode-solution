package math

/*
 * Company : Airbnb, Twitter, Uber
 * LeetCode Difficulty: easy
 * My Judgement: Medium
 */
class L202 {

    fun isHappy(n: Int): Boolean {
        val numberSet = HashSet<Int>()
        var sum = 0
        var number = n
        while(numberSet.add(number)) {
            while(number > 0) {
                val temp = number % 10
                sum += temp * temp
                number /= 10
            }
            if (sum == 1) {
                break
            }
            number = sum
            sum = 0
        }
        return sum == 1
    }
}