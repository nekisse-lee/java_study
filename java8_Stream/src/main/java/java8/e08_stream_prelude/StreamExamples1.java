package java8.e08_stream_prelude;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples1 {

    public static void main(String[] args) {

        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(value -> System.out.print(value + " "));

//        IntStream.iterate(1, i -> i+1 ).forEach(i -> System.out.print(i + " "));

        Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE)).forEach(i -> System.out.print(i + " "));




    }
}
