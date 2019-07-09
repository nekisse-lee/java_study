package thisisjava.chap14_larmbda.sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
    private static List<Student> list = Arrays.asList(
        new Student("홍길동", 90, 96),
        new Student("신용권", 95, 93)
    );


    public static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student : list) {
            sum += function.applyAsInt(student);
        }
        double avg = (double)sum / list.size();
        return avg;
    }

    public static void main(String[] args) {

        double englishAvg = avg(studentEnglishScore -> studentEnglishScore.getEnglishScore());
        System.out.println("englishAvg = " + englishAvg);

        double mathAvg = avg(student -> student.getMathScore());

        System.out.println("mathAvg = " + mathAvg);
    }


}
