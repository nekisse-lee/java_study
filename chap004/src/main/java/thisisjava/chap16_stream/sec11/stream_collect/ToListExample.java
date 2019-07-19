package thisisjava.chap16_stream.sec11.stream_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

    public static void main(String[] args) {

        List<Student> totalList = Arrays.asList(
            new Student("홍길동", 10, Student.Sex.MALE),
            new Student("김수애", 6, Student.Sex.FEMALE),
            new Student("신용권", 10, Student.Sex.MALE),
            new Student("박수미", 6, Student.Sex.FEMALE)
        );

        //남학생만 리스트 생성

        List<Student> maleList = totalList.stream()
            .filter(student -> student.getSex() == Student.Sex.MALE)
            .collect(Collectors.toList());

        maleList.stream()
            .forEach(System.out::println);


        System.out.println();
        //여학생들만 hashset생성

        Set<Student> femaleSet = totalList.stream()
            .filter(student -> student.getSex() == Student.Sex.FEMALE)
            .collect(Collectors.toCollection(HashSet::new));
        femaleSet.forEach(student -> System.out.println(student.getName()));

    }


}
