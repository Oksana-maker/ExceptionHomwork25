package org.itstep;

import java.util.Arrays;

public class ListDriver {
    public static void main(String[] args) {
        List<Integer> lists = new List(10);
        try {
            for (int i = 0; i < 10; i++) {
                lists.add(12 + i);
            }
        } catch (FullListException e) {
            throw new RuntimeException(e);
        }

        try {
            for (int i = 0; i < 11; i++) {
                lists.removeLast();
            }

        } catch (EmptyListException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(new List[]{lists}));
    }
}
