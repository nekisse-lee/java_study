package java8;

import java.util.function.Function;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {

        Function<String, Integer> toInt = value -> Integer.valueOf(value);

        Integer number = toInt.apply("100");
        System.out.println(number);

//        final Function<Integer, Integer> identity = Function.identity();
        final Function<Integer, Integer> identity = t -> t;

        System.out.println(identity.apply(999));
    }


}
