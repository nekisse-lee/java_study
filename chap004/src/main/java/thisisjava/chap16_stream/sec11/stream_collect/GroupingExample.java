package thisisjava.chap16_stream.sec11.stream_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

    public static void main(String[] args) {
    List<Student> totalList = Arrays.asList(
        new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
        new Student("김수애", 6, Student.Sex.FEMALE, Student.City.Busan),
        new Student("신용권", 10, Student.Sex.MALE, Student.City.Busan),
        new Student("박수미", 6, Student.Sex.FEMALE, Student.City.Seoul)
    );

        Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
            .collect(Collectors.groupingBy(o -> o.getSex()));


        System.out.print("남학생 : ");
        mapBySex.get(Student.Sex.MALE).stream()
            .forEach(student -> System.out.print(student.getName() + " "));
        System.out.println();

        System.out.print("여학생 : ");
        mapBySex.get(Student.Sex.FEMALE).stream()
            .forEach(student -> System.out.print(student.getName() + " "));
        System.out.println();


        System.out.println();


        Map<Student.City, List<String>> mapByCity = totalList.stream()
            .collect(
                Collectors.groupingBy(
                    (Student student) -> student.getCity(),
                    Collectors.mapping(o -> o.getName(), Collectors.toList())
                )
            );

        System.out.println("[서울]");
        List<String> strings = mapByCity.get(Student.City.Seoul);
        strings.stream()
            .forEach(name-> System.out.println(name+ " "));


        System.out.println("[부산]");
        mapByCity.get(Student.City.Busan);
        strings.stream()
            .forEach(name-> System.out.println(name+ " "));

    }



}
