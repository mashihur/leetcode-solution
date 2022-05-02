package searching;

/*
 * LeetCode Difficulty: easy
 * My Judgement: Medium
 */
public class L69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        } else if (x < 4) {
            return 1;
        }

        int low = 0, high = x/2, mid, val;
        while(low <= high) {
            mid = (low + high) / 2;
            val = checkValue(mid, x);
            if (val < 0) {
                high = mid - 1;
            } else if (val > 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return 0;
    }

    private int checkValue(int sqrt, int value) {
        if ((value / sqrt) < sqrt) {
            return -1;
        } else if ((value/(sqrt + 1)) >= (sqrt + 1)) {
            return 1;
        }
        return 0;
    }
}
