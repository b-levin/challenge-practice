package linked_lists;

import java.util.*;


public class kToLast {

    public static int kLast(LinkedList<Integer> list, int k) {
        int pos = list.size() - k;
        return list.get(pos);
    }

    public static void main(String args[]) {
        LinkedList<Integer> l1 = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            l1.add(i);
        }
        System.out.printf("%d\n", kLast(l1, 4));
    }
}