package thisisjava.chap15_collection.sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(1, "홍길동"), 90);

        System.out.println("총 entry 수 : " + map.size());

        System.out.println(map.get(new Student(1,"홍길동")));

    }

}
