package string

import org.junit.Assert
import org.junit.Test

/*
 * Company : Amazon, Microsoft, Bloomberg, Google
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
class L387kt {

    fun firstUniqChar(s: String): Int {
        var map = mutableMapOf<Char, Int>()
        for (character in s) {
            map[character] = map.getOrDefault(character, 0) + 1
        }

        for (character in s) {
            if (map[character] == 1) {
                return s.indexOf(character)
            }
        }

        // for ( key in map.keys) {
        //     if (map[key] == 1) {
        //         output = Math.min(output, s.indexOf(key));
        //     }
        // }

        return -1
    }

    @Test
    fun test1() = Assert.assertEquals(0, firstUniqChar("leetcode"))

    @Test
    fun test2() = Assert.assertEquals(-1, firstUniqChar("leetcodeltcode"))

    @Test
    fun test3() = Assert.assertEquals(5, firstUniqChar("leetcodectl"))

    @Test
    fun test4() = Assert.assertEquals(2, firstUniqChar("loveleetcode"))

    @Test
    fun test5() = Assert.assertEquals(-1, firstUniqChar("aabb"))

}