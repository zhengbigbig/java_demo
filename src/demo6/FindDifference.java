package demo6;

import java.util.*;

 class FindDifference {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        System.out.println(t.length());
        for (int j = 0; j < t.length(); j++) {
            sMap.put(t.charAt(j), 0);
        }
        System.out.println(sMap);

        for (int j = 0; j < t.length(); j++) {
            for (int i = 0; i < s.length(); i++) {
                char chi = s.charAt(i);
                char chj = t.charAt(j);
                if (chi == chj) {
                    sMap.put(chj, 1);
                }

            }
        }

        for (char str : sMap.keySet()) {
            if (sMap.get(str) == 0) {
                return str;
            }
        }
        return 'a';
    }

}
