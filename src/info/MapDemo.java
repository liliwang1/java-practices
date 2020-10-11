package info;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // HashMap    TreeMap   LinkedHashMap
        // key-value pair, dictionary/HashMap/HashTable

        Map m = new HashMap();
        m.put("Tim", 5);
        m.put("Joe", "x");
        m.put(11, 5);

        System.out.println(m);
        System.out.println(m.get("Tim"));
        System.out.println(m.containsKey(11));
        System.out.println(m.containsValue(5));
        System.out.println(m.get(5));
        System.out.println(m.values());
        System.out.println(m.isEmpty());

        m.clear();
    }
}
