package demo2;

import java.util.Arrays;

public class Solution {
    public int[] towSum(int[] numbers,int target){
        int size = 2;
        int[] arr = new int[size];
        for(int num:numbers){
            for(int num2:numbers){
                if(num + num2 == target){
                    int a = Arrays.binarySearch(numbers,num);
                    int b = Arrays.binarySearch(numbers,num2);
                    if(a > b){
                        arr[0] = b;
                        arr[1] = a;
                    }else {
                        arr[0] = a;
                        arr[1] = b;
                    }
                }
            }
        }
        return arr;
    }
}
