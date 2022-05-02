package array;

/*
 * Company : Google
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L11 {
    public int maxArea(int[] height) {
        int area = 0, left = 0, right = height.length - 1, temp;
        while(left < right)  {
            temp = Math.min(height[left], height[right]) * (right - left);
            if (temp > area) {
                area = temp;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return area;
    }
}

