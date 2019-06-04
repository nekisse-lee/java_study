package java8_3.chap11.map;

import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        System.out.println("map = " + map + "\n");

        Set set = map.keySet();
        System.out.println("set = " + set+ "\n");

        System.out.println("map.values() = " + map.values());

        map.remove("asdf");
        System.out.println("map.get(\"asdf\") = " + map.get("asdf"));
        System.out.println("map.getOrDefault(\"asdf\",\"N/A\") = " + map.getOrDefault("asdf", "N/A"));

        map.put("asdf", "1234");
        Set set2 = map.entrySet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
//            System.out.println("it.next() = " + it.next());
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("e.getKey() = " + e.getKey());
            System.out.println("e.getValue() = " + e.getValue());

        }

    }
}
