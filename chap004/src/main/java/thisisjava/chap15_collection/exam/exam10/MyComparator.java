package thisisjava.chap15_collection.exam.exam10;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.score < o2.score) {
            return -1;
        } else if (o1.score == o2.score) {
            return 0;
        } else return 1;

    }
}
