package demo6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 泛型
        // key是String ,value是Integer
        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        Stack<String> stringStack = new Stack<String>();
        Stack<Integer> intStack = new Stack<Integer>();

        stringStack.push("abc");
        String one = stringStack.pop();

        intStack.push(12);
        Integer two = intStack.pop();

        // 集合

        // 列表
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("a");
//        arrayList.get(0);
//        arrayList.subList(0, 5); // 从位置0开始，到5的子列表

        // for 循环遍历列表
        for (String item : arrayList) {
            System.out.println(item);
        }

        // Set -- 主要用于去重
        Set<String> set = new HashSet<>();

        set.add("x");
        set.add("y");
        set.add("x");

        for(String item: set){
            System.out.println(item);
        }

        FindDifference findDifference = new FindDifference();
        String s = "abcd";
        String t = "abcde";
        System.out.println(findDifference.findTheDifference(s,t));

        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(4);
        minStack.push(3);
        minStack.push(1);
        System.out.println(minStack.getMin());
    }
}
