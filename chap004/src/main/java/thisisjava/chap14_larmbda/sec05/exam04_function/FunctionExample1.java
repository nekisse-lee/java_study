package thisisjava.chap14_larmbda.sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
    private static List<Student> list = Arrays.asList(
        new Student("홍길동", 90, 96),
        new Student("신용권", 95, 93)
    );

    public static void printString(Function<Student, String> function) {
        for (Student student : list) {
            System.out.print(function.apply(student) + " ");
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function) {
        for (Student student : list) {
            System.out.print(function.applyAsInt(student) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("[학생 이름]");
        printString(student -> student.getName());

        System.out.println("[영어점수]");
        printInt(student -> student.getEnglishScore());

        System.out.println("[수학점수]");
        printInt(student -> student.getMathScore());

    }


}
