package info;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map m = new HashMap(); // Map<Character, Integer> m = new HashMap<>();
        String str = "Hello, my name is Lucy and I programme";

        for (char x : str.toLowerCase().toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x, old + 1);
            } else {
                m.put(x, 1);
            }
        }
        m.remove(' ');
        m.remove(',');

        System.out.println(m);
    }
}
