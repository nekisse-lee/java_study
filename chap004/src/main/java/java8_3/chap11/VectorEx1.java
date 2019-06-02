package java8_3.chap11;


import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {

        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");

        v.forEach(System.out::println);
        System.out.println("v.capacity() = " + v.capacity());
        System.out.println("v.size() = " + v.size());


        System.out.println("v.trimToSize()");
        v.trimToSize();

        System.out.println("v.capacity() = " + v.capacity());
        System.out.println("v.size() = " + v.size());

        System.out.println("v.ensureCapacity(6) ");
        v.ensureCapacity(6);
        System.out.println("v.capacity() = " + v.capacity());
        System.out.println(v);

        System.out.println("v.setSize(7)");
        v.setSize(7);

        System.out.println("v.size() = " + v.size());
        System.out.println("v.capacity() = " + v.capacity());
        System.out.println("v = " + v);


        System.out.println("\n" + "v.clear()" );
        v.clear();
        System.out.println("v.size() = " + v.size());
        System.out.println("v.capacity() = " + v.capacity());
        System.out.println("v = " + v);

    }
}
