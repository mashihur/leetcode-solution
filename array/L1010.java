package array;

/*
 * Company : Amazon 6, Google 2
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */
public class L1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int sum = 0, i, mod;
        int[] ar = new int[60];
        for (i = 0; i < time.length; i++) {
            mod = time[i] % 60;
            sum += ar[60 - ((mod == 0) ? 60 : mod)];
            ar[time[i] % 60]++;
        }
        return sum;
    }


//     public int numPairsDivisibleBy60(int[] time) {
//         int sum = 0, i;
//         int[] ar = new int[60];
//         for (i = 0; i < time.length; i++) {
//             ar[time[i] % 60]++;
//         }
//         for (i = 1; i < 30; i++) {
//             sum += ar[i] * ar[60 - i];
//         }
//         if (ar[0] % 2 == 0) {
//             sum += (ar[0] / 2) * (ar[0] - 1);
//         } else {
//             sum += ar[0] * (ar[0] - 1) / 2;
//         }
//         if (ar[30] % 2 == 0) {
//             sum += (ar[30] / 2) * (ar[30] - 1);
//         } else {
//             sum += ar[30] * (ar[30] - 1) / 2;
//         }
//         return sum;
//     }
}
