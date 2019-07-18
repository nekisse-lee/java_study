package thisisjava.chap16_stream.sec02.stream_kind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
            new Student("홍길동", 10),
            new Student("신용권", 20),
            new Student("유미", 30)
        );

        Stream<Student> stream = studentList.stream();
        stream.forEach(student -> System.out.println(student.getName()));

    }
}
