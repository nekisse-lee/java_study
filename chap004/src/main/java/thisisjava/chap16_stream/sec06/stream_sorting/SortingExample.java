package thisisjava.chap16_stream.sec06.stream_sorting;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{5, 3, 2, 1, 4});

        intStream
            .sorted()
            .forEach(n -> System.out.println(n+ ","));
        System.out.println();

        List<Student> studentList = Arrays.asList(
            new Student("홍길동", 30),
            new Student("신용권", 10),
            new Student("유미선", 20)
        );

        studentList.forEach(student -> System.out.println(student.getScore()));
        System.out.println();

        studentList.stream()
            .sorted()
            .forEach(s -> System.out.println(s.getScore() + ","));

        System.out.println();

        studentList.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(student -> System.out.println(student.getScore() + ","));
        System.out.println();


    }

}
