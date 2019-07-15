package thisisjava.chap15.sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

@SuppressWarnings("ALL")
public class TreeSetExample2 {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        NavigableSet<Integer> descendingSet = scores.descendingSet();

        for (Integer score : descendingSet) {
            System.out.println(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> asendingSet = descendingSet.descendingSet();
        for (Integer score : asendingSet) {
            System.out.println(score + " ");
        }
        System.out.println();

        Integer pollLast = asendingSet.pollLast();
        System.out.println("pollLast = " + pollLast);
    }

}