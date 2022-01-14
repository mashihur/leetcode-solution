package string

/*
 * Company : Facebook
 * LeetCode Difficulty: Easy
 * My Judgement: Medium - simple trick
 */
class L680 {
    fun validPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1
        var deleted = 0
        while(i < j) {
            if (s[i] != s[j]) {
                return isValid(s, i + 1, j) || isValid(s, i, j - 1)
            }
            i++; j--
        }
        return true
    }

    fun isValid(s: String, i: Int, j: Int): Boolean {
        var left = i
        var right = j
        while(left < right) {
            if (s[left] != s[right])
                return false
            left++; right--;
        }
        return true
    }
}