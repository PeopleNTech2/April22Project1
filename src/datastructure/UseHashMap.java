package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Chicago");
        map.put(4, "Miami");
        map.put(5, "Dallas");

        System.out.println(map);
        System.out.println(map.get(2));

        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
