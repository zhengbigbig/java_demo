package demo2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(numbers)+"target = 9");
        int[] a = solution.towSum(numbers,9);
        System.out.println(Arrays.toString(a));

        int[] numbers2 = new int[]{3, 7, 8, 9};
        System.out.println(Arrays.toString(numbers2)+"target = 10");
        int[] a2 = solution.towSum(numbers2,10);
        System.out.println(Arrays.toString(a2));

        int[] numbers3 = new int[]{2, 7, 15, 21};
        System.out.println(Arrays.toString(numbers3)+"target =36");
        int[] a3 = solution.towSum(numbers3,36);
        System.out.println(Arrays.toString(a3));

        int[] numbers4 = new int[]{6 ,9, 11, 20};
        System.out.println(Arrays.toString(numbers4)+"target = 20");
        int[] a4 = solution.towSum(numbers4,20);
        System.out.println(Arrays.toString(a4));

        int[] numbers5 = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(numbers5)+"target = 4");
        int[] a5 = solution.towSum(numbers5,4);
        System.out.println(Arrays.toString(a5));
    }
}
