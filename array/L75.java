package array;

/*
 * Company : Facebook
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L75 {
    public void sortColors(int[] arr) {
        int left = 0, right = arr.length - 1, index;
        for (index = left; index <= right; index++) {
            if (arr[index] == 0) {
                swap(arr, left, index);
                left++;
            } else if (arr[index] == 2) {
                swap(arr, index, right);
                right--;
                index--;
            }
        }
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
