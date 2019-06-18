package demo6;

import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            if (numMap.containsKey(num)) {
                numMap.put(num, 2);
            } else {
                numMap.put(num, 1);
            }
        }
        for (Integer num : numMap.keySet()) {
            if (numMap.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }

    public int singleNumber2(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(num)) {
                numSet.remove(num);
            } else {
                numSet.add(num);
            }
        }

        for (Integer num : numSet) {
            return num;
        }
        return 0;
    }
}
