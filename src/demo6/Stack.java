package demo6;

import java.util.ArrayList;

// 泛型  解决同一个方法可以传入不同参数类型
public class Stack<T> {
    ArrayList<T> store = new ArrayList<T>();

    public void push(T item) {
        store.add(item);
    }

    public T pop() {
        T tmp = store.get(store.size() - 1);
        store.remove(store.size() - 1);
        return tmp;
    }
}

