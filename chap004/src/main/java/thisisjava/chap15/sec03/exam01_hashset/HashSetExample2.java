package thisisjava.chap15.sec03.exam01_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체수: " + set.size());


    }

}