package thisisjava.chap16_stream.sec02.stream_kind;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);

        stream.forEach(value -> sum += value);
        System.out.println("총합 = " + sum);

    }

}
