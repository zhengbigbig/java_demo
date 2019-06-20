package demo6;

import java.util.ArrayList;

public class MinStack {
    ArrayList<Integer> store = new ArrayList<>();

    void push(Integer x) {
        store.add(x);
    }

    void pop() {
        store.remove(store.size() - 1);
    }

    int top() {
        Integer tmp = store.get(store.size() - 1);
        return tmp;
    }

    int getMin() {
        Integer min = store.get(0);
        System.out.println(store);
        System.out.println(store.size());
        for (int i = 1; i < store.size(); i++) {
            if(store.get(i) < min){
                min = store.get(i);
            }
        }
        return min;
    }
}
