package thisisjava.chap14_larmbda.sec05.exam06_predecate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    private static List<Student> list =
            Arrays.asList(
                    new Student("홍길동", "남자", 90),
                    new Student("김순희", "여자", 90),
                    new Student("김자바", "남자", 95),
                    new Student("박한나", "여자", 92)
            );

    public static double avg(Predicate<Student> predicate) {
        int count = 0;
        int sum = 0;
        for (Student student : list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }
        }
        return (double) sum / count;
    }


    public static void main(String[] args) {
        //남자 평균점수
        double maleAvg = avg((student ->
                student.getSex().equals("남자")
        ));
        System.out.println("maleAvg = " + maleAvg);

        //여자 평균점수
        double femail = avg(student ->
            student.getSex().equals("여자")
        );
        System.out.println(femail);

    }



}
