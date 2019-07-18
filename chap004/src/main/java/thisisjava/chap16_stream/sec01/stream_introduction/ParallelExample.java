package thisisjava.chap16_stream.sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("홍길동", "신용권", "감자바", "람다식", "박병렬");

        //순차처리 싱글스레드
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print);

        System.out.println();

        //병렬처리 멀티스레드
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);

    }

    private static void print(String str) {
        System.out.println(str +":" + Thread.currentThread().getName());
    }



}
