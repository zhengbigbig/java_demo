package demo5;

import java.util.*;

public class Sorter {

    // 快速排序实现
    public static void qsort(int left, int right, ArrayList<Integer> input) {
        int i = left, j = right;
        int tmp = input.get(left);
        while (i < j) {
            //先从右边扫描再从左边，依次得到结果
            while (i < j && input.get(j) >= tmp) {
                j--;
            }
            if (i >= j) {
                break;
            } else {
                input.set(i, input.get(j));
            }
            while (i < j && input.get(i) <= tmp) {
                i++;
            }
            if (i >= j) {
                break;
            } else {
                input.set(j, input.get(i));
            }
        }
        input.set(i, tmp);
        //i == j = pivot
        if (left < i) {
            qsort(left, i - 1, input);
        }
        if (i < right) {
            qsort(j + 1, right, input);
        }


    }


}
