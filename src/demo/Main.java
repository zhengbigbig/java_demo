package demo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> gender = new HashMap<String, String>(); //哈希表实现的一个Map，声明一个哈希表

        //每个人对应的性别

        //增
        gender.put("zheng","bigbig");
        gender.put("pipi","zhen");
        //查
        if(gender.containsKey("zheng")){
            System.out.println(gender.get("zheng"));
        }

        String result = gender.get("pipi");
        if(result != null){
            System.out.println(result);
        }
        //改 和增一样，只是同样的键值会覆盖
        gender.put("zheng","lovezhenzhen");

        //删
        gender.remove("zheng");

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(3);
        stack.push(5);

        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 3

        //深度优先搜索!本质就是栈的使用

        //只看顶部数据，但是不删除
        stack.peek();

        //检查是否为空
        stack.empty();

        // 队列

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(3);
        queue.add(5);

        System.out.println(queue.poll()); //3
        System.out.println(queue.poll()); //5

        Integer first_of_queue = queue.peek();
        queue.isEmpty();


    }
}
