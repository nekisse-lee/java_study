package java8_3.chap11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest {
    public static void main(String[] args) {
        Student[] sArr = {
            new Student(100, "abc"),
            new Student(200, "aaa"),
            new Student(300, "bbb"),
            new Student(400, "ccc")
        };

        Arrays.sort(sArr);
        System.out.println("sArr = " + Arrays.toString(sArr));

        Arrays.sort(sArr, new NameAscending());
        System.out.println("sArr = " + Arrays.toString(sArr));
    }

}

class NameAscending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;


//        return s1.name.compareTo(s2.name);
        return s2.name.compareTo(s1.name);
    }

}


class Student implements Comparable {
    int score;
    String name;


    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Student s2 = (Student) o;
//        return this.score - s2.score;
        return s2.score - this.score;
//        return (this.score - s2.score) * -1;

    }

    @Override
    public String toString() {
        return "\n Student {" +
            "score=" + score +
            ", name='" + name + '\'' +
            '}';
    }
}
