package java8_3.chap11.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionsTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc");

        list = Collections.unmodifiableList(list);
        System.out.println("list.get(0) = " + list.get(0));

//        list.add("aaa");
//        list.remove("0");


        Set<String> set = Collections.singleton("aaa");
//        set.add("bbb");
        System.out.println(set.remove(0));
        System.out.println(set);

//        List checkedList = Collections.checkedList(new ArrayList<>(), String.class);
//
//        checkedList.add("abc");
//        checkedList.add(1);

        List<String > checkedList = new ArrayList<>();
        checkedList.add("abc");
        checkedList.add(String.valueOf(1));



    }


}
