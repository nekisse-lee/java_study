package thisisjava.chap16_stream.sec02.stream_kind;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FormArrayExample {
    public static void main(String[] args) {

        String[] strArray = {"홍길동", "신용권", "김미나"};
        Stream<String> strStream = Arrays.stream(strArray);

        strStream.forEach(s -> System.out.println(s + ","));

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(i-> System.out.println(i + ","));
    }
}
