package java8.e08_stream_prelude;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamPrelude {

    public static void main(String[] args) {

        int abs1 = Math.abs(-1);
        int abs2 = Math.abs(1);

        System.out.println("abs1 = " + abs1);
        System.out.println("abs2 = " + abs2);
        System.out.println("abs1 == abs2 = " + (abs1 == abs2));

        int minInt = Math.abs(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println("minInt = " + minInt);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("\nmapOld(numbers, i -> i * 2)");
        System.out.println(
            mapOld(numbers, i -> i * 2)
        );

        System.out.println("mapOld(numbers, null)");
        System.out.println(
            mapOld(numbers, null)
        );

        System.out.println("");
        System.out.println("map(numbers, i -> i * 2)\n" +
            map(numbers, i -> i * 2)
        );

        System.out.println("map(numbers, i -> i)\n" +
            map(numbers, i -> i)
        );

        System.out.println("map(numbers, Function.identity())\n" +
            map(numbers, Function.identity())
        );


    }

    private static <T, R> List<R> map(final List<T> list, final Function<T, R> mapper) {
//        final Function<T, R> function;
//        if (mapper != null) {
//            function = mapper;
//        } else {
//            function = t -> (R) t;
//        }

        final List<R> result = new ArrayList<>();
        for (final T t : list) {
            result.add(mapper.apply(t));
        }
        return result;
    }

    private static <T, R> List<R> mapOld(final List<T> list, final Function<T, R> mapper) {
        final List<R> result;
        if (mapper != null) {
            result = new ArrayList<>();
        } else {
            result = new ArrayList<>((List<R>) list);
        }
        if (result.isEmpty()) {

            for (final T t : list) {
                result.add(mapper.apply(t));
            }
        }
        return result;
    }


}
