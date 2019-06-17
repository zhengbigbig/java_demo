package demo6;

import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // 泛型
        // key是String ,value是Integer
        HashMap<String,Integer> counts = new HashMap<String, Integer>();
        Stack<String> stringStack = new Stack<String>();
        Stack<Integer> intStack = new Stack<Integer>();

        stringStack.push("abc");
        String one = stringStack.pop();

        intStack.push(12);
        Integer two = intStack.pop();
    }
}
