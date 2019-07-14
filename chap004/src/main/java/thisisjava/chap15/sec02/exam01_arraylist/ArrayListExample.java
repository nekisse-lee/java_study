package thisisjava.chap15.sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("IBATIS");

        int size = list.size();
        System.out.println("총 객체수 = " + size);

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        list.remove("JDBC");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        boolean ibatis = list.remove("IBATIS");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        System.out.println("boolean: batis = " + ibatis);
    }


}
