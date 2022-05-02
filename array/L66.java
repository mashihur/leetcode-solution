package array;

/*
 * Company : Google, Microsoft, ebay
 * LeetCode Difficulty: easy
 * My Judgement: easy
 */
public class L66 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] output = new int[digits.length + 1];
        output[0] = 1;
        return output;
    }
//    public int[] plusOne(int[] digits) { // My first approach, time complexity is same
//        int carry = 1, i, outputLen;
//        if (isAllNine(digits)) {
//            int[] output = new int[digits.length + 1];
//            output[0] = 1;
//            return output;
//        }
//        for (i = digits.length - 1; i >= 0; i--) {
//            int temp = digits[i] + carry;
//            digits[i] = (temp) % 10;
//            carry= temp / 10;
//        }
//
//        return digits;
//    }
//
//    private boolean isAllNine(int[] digits) {
//        for (int value : digits) {
//            if (value != 9) {
//                return false;
//            }
//        }
//        return true;
//    }
}
