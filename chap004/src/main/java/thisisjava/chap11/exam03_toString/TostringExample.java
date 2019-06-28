package thisisjava.chap11.exam03_toString;

import java.util.Date;

public class TostringExample {
    public static void main(String[] args) {

        Object obj1 = new Object();
        Date obj2 = new Date();

        System.out.println("obj1.toString() = " + obj1.toString());
        System.out.println("obj2.toString() = " + obj2.toString());
    }
}
