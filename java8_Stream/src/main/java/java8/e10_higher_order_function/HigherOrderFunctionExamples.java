package java8.e10_higher_order_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HigherOrderFunctionExamples {

    public static void main(String[] args) {


        final Function<Function<Integer, String>, String> f = g -> g.apply(10);
        System.out.println(
            f.apply(i -> "#" + i)  // "#10"
        );


        final Function<Integer, Function<Integer, Integer>> f2 =
            i -> i2 -> i + i2;
        System.out.println(
            f2.apply(1).apply(9)// "10"
        );


        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(
            map(list, i -> "#" + i)
        );

        System.out.println(
            list.stream()
                .filter(integer -> integer > 2)
                .map(i -> "#" + i)
                .collect(Collectors.toList())
        );

//        Function.identity();

        Function<Integer, Function<Integer, Function<Integer, Integer>>> f3 =
            i1 -> i2 -> i3 -> i1 + i2 + i3;

//        Function<Integer, Function<Integer, Integer>> applied1 = f3.apply(1);
//        Function<Integer, Integer> applied2 = applied1.apply(2);
        System.out.println(
        "f3.apply(1).apply(2).apply(3) = " + f3.apply(1).apply(2).apply(3)
        );

        Function<Integer, Function<Integer, Integer>> plus10 = f3.apply(10);
        System.out.println(
        "plus10.apply(1).apply(1) = " + plus10.apply(1).apply(1)
        );

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        final List<R> result = new ArrayList<>();
        for (T t : list) {
            R apply = mapper.apply(t);
            result.add(apply);
        }
        return result;
    }

}
