package thisisjava.chap16_stream.exam.exam06;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        List<Member> list = Arrays.asList(
            new Member("홍길동", 30),
            new Member("신용권", 40),
            new Member("감자바", 26)
        );

        double asDouble = list.stream()
            .mapToInt(Member::getAge)
            .average()
            .getAsDouble();


        System.out.println("평균 나이 " + asDouble);


    }
}
