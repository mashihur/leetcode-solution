package array;

import java.util.*;

/*
 * Company : Yelp
 * LeetCode Difficulty: Medium
 * My Judgement: Medium - Use of PriorityQueue (Heap) | HashMap sorting by value
 */
public class L347 {

    public int[] topKFrequent(int[] nums, int k) {
        int[] topFrequent = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return map.get(i1) - map.get(i2);
            }
        };
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(comparator);
//        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((i1, i2) -> map.get(i1) - map.get(i2));// By using lambda

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.add(entry.getKey());
            if  (queue.size() > k) {
                queue.poll();
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            topFrequent[i] = queue.poll();
        }

        return topFrequent;
    }

//    public int[] topKFrequent(int[] nums, int k) { // sorting the map by value
//        int[] topFrequent = new int[k];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        }
//
//        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
//        Collections.sort(list, (entry1, entry2) -> entry2.getValue() - entry1.getValue());
//
//        for (int i = 0; i < k; i++) {
//            topFrequent[i] = list.get(i).getKey();
//        }
//        return topFrequent;
//    }
}
