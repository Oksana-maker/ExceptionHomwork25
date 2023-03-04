package org.itstep;

import java.util.Arrays;

public class List<T> {
    private T[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = (T[])(new Object[size]);
    }

    public T get(int index) {
        return obj[index];
    }

    public void add(T item) throws FullListException {
        if (oversize()){
            throw new FullListException("There is no space in the array");
        }
        obj[cur++] = item;
    }

    public void removeLast() throws EmptyListException {
        if (!hasNext()){
            throw new EmptyListException("Array is empty");
        }
        obj[--cur] = null;
    }
    public boolean hasNext() {
        return cur > 0;
    }
    public boolean oversize(){
        return cur>size-1;
    }

    @Override
    public String toString() {
        return "List{" +
                "obj=" + Arrays.toString(obj) +
                '}';
    }
}
