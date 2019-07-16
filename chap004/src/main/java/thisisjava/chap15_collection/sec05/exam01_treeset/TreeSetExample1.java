package thisisjava.chap15_collection.sec05.exam01_treeset;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;
        score = scores.first();
        System.out.println("최소값 = " + score);

        score = scores.last();
        System.out.println("최대값 = " + score + "\n");

        score = scores.lower(new Integer(94));
        System.out.println("94보다 작은 = " + score + "\n");

        score = scores.higher(new Integer(95));
        System.out.println("95보다 큰 = " + score + "\n");

        score = scores.floor(new Integer(95));
        System.out.println("95 이거나 아래  : " + score + "\n");

        score = scores.ceiling(new Integer(85));
        System.out.println("85 이거나 위 : " + score + "\n");

        while (!scores.isEmpty()) {
            score = scores.pollLast();
            System.out.println(score + "(남은 객체 수 : " + scores.size() + ")");
        }



//        Iterator<Integer> iterator = scores.iterator();
//        while (iterator.hasNext()) {
//            int s = iterator.next();
//            iterator.remove();
//            System.out.println(s + " 남은 객체수 : " + scores.size() );
//        }
    }

}
