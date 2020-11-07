package info;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // set: unordered collection of unique elements (a bubble) // for...each works
        Set<Integer> t = new HashSet<>(); // TreeSet  LinkedHashSet
        t.add(5);
        t.add(6);
        t.add(7);
        t.add(7);
        t.add(8);
        t.remove(8);

        System.out.println(t);
        System.out.println(t.size());
        System.out.println(t.isEmpty()); // false
        System.out.println(t.contains(5)); // true
        System.out.println(t.contains(0)); // false


        t.clear();
        System.out.println(t);
    }
}
