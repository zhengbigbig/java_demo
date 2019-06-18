package demo6;

import java.util.ArrayList;

public class IntStack {
    ArrayList<Integer> store = new ArrayList<>();

    public void push(Integer item) {
        store.add(item);
    }

    public Integer pop() {
        Integer tmp = store.get(store.size() - 1);
        store.remove(store.size() - 1);
        return tmp;
    }


}
