package demo6;

import java.util.*;

public class TwoSums {
    ArrayList<Integer> towSums(ArrayList<Integer> nums, Integer target) {
        // 1. 出现过什么样的数字为 key ，它原来的位置为value
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            numMap.put(nums.get(i), i);
        }

        // 找到一堆数的和 == target！
        for (int j = 0; j < nums.size(); j++) {
            if (numMap.containsKey(target - nums.get(j))) {
                ArrayList<Integer> results = new ArrayList<>();
                results.add(numMap.get(target - nums.get(j)));
                results.add(j);
                return results;
            }
        }
        return new ArrayList<>();
    }
}
