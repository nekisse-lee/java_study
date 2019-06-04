package java8_3.chap11.HashSet;

import java.util.*;

public class HashSetEx1 {
    public static void main(String[] args) {

        Object[] objArr = {"1", new Integer(1), "2", "2", "4", "3"};
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
//            set.add(objArr[i]);
            set.add(new Random().nextInt(45)+1);
        }

        System.out.println("set = " + set);
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println("list = " + list);

    }

}
