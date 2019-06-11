package demo5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(49, 38, 65, 97, 76, 13, 27, 49));
        ArrayList<Integer> input2 = new ArrayList<Integer>(Arrays.asList(234, 23, 12, 323, 34,545,3231, 1,12,233));
        int left = 0;
        int right = input.size() -1;
        int right2 = input2.size() -1;
        Sorter.qsort(left, right, input);
        Sorter.qsort(left, right2, input2);
        System.out.println(input);
        System.out.println(input2);
    }
}
