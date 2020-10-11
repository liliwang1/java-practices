package info;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>(); // LinkedList
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        System.out.println(t);
        System.out.println(t.get(0));
        t.set(1, 5);
        System.out.println(t);
//        t.set(6, 3); // error , index 6 does not exist
//        System.out.println(t);

        System.out.println(t.size());
        System.out.println(t.isEmpty());
        System.out.println(t.subList(0, 2));
    }
}
