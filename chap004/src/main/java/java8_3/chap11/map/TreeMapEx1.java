package java8_3.chap11.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {

        Map treeMap = new TreeMap();

        treeMap.put("myId", "1234");
        treeMap.put("aaa", "1111");
        treeMap.put("ccc", "1234");
        treeMap.put("bbb", "1234");

        System.out.println("treeMap = " + treeMap);


    }
}
