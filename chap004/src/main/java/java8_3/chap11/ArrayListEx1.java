package java8_3.chap11;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(10);
        System.out.println("list.size() = " + list.size());

        list.add("111");
        list.add("222");
        list.add("333");
        list.add("222");
        list.add(333);

        System.out.println(list);

        list.add(0, "000");

        System.out.println(list);

        System.out.println("list.indexOf(\"333\") = " + list.indexOf("333"));
        list.remove("333");

        System.out.println(list);

        System.out.println(list.remove("333"));

        System.out.println("indexOf(\"333\") = " + list.indexOf("333"));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + " 번째  =   " );
            list.set(i, String.valueOf(i));
            System.out.println(list);
        }

//        for (int i = 0; i < list.size(); i = 0) {
//            list.remove(i);
//            System.out.println(list);
//            System.out.println("list.size() = " + list.size());
//            System.out.println("list.get(0) = " + list.get(0));
//
//        }

        for (int i = list.size()-1; i >= 0; i--) {
            list.remove(i);
            System.out.println(list);
            System.out.println("list.size() = " + list.size());
            System.out.println("list.get(0) = " + list.get(0));

        }


    }
}
