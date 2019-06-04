package java8_3.chap11.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {

//        TreeSet set = new TreeSet(new NameComp2());
        TreeSet set = new TreeSet();
        set.add(100);
        set.add(50);
        set.add(70);
        set.add(80);

//        set.add(new Student2());

//        System.out.println("set = " + set);
        System.out.println("set.first() = " + set.first());
        System.out.println("set.last() = " + set.last());
    }

}

class NameComp2 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}


class Student2 {//implements Comparable
    String name;
    int score;

    public Student2(String name, int score) {
        this.name = name;
        this.score = score;
    }


    public Student2() {

    }

//    @Override
    public int compareTo(Object o) {
        return 1;
    }

    @Override
    public String toString() {
        return name;
    }
}
