package java8_3.chap11.Collection_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

         Iterator iterator  = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            iterator.remove();
        }

        iterator  = list.iterator();

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        System.out.println("\n" + "forEachRemaining");
        iterator.forEachRemaining(System.out::println);

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

    }
}
