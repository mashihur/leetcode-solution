package string;

/*
 * Company : Facebook, LinkedIn, Microsoft, Uber
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L125 {

    private boolean isAlphaNumeric(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right) {
            while (left < right && !isAlphaNumeric(s.charAt(left))) {
                left++;
            }
            while (left < right && !isAlphaNumeric(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

//     public boolean isPalindrome(String s) { // Regular expression is costly
//         String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//         int i = 0, j = str.length() - 1;
//         while(i < j) {
//             if (str.charAt(i) != str.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }

}
