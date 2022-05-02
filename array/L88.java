package array;

/*
 * Company : Facebook, Amazon, Microsoft, Google
 * LeetCode Difficulty: Easy
 * My Judgement: Medium
 */
public class L88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        m--;
        n--;
        while(m >= 0 && n >= 0) {
            if (nums2[n] > nums1[m]) {
                nums1[index--] = nums2[n--];
            } else {
                nums1[index--] = nums1[m--];
            }
        }
        while(n >= 0) {
            nums1[index--] = nums2[n--];
        }
    }
}
