package java8.e08_stream_prelude;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples3 {
    public static void main(String[] args) {
        System.out.println("collect(Collectors.toList()): " +
            Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .collect(Collectors.toList())
        );

        System.out.println("collect(Collectors.toSet()): " +
            Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .collect(Collectors.toSet())
        );


        System.out.println("collect(Collectors.joining()): " +
            Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .collect(Collectors.joining())
        );

        System.out.println("collect(Collectors.joining(\", \")): " +
            Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .collect(Collectors.joining(", "))
        );


        System.out.println("collect(Collectors.joining(\", \",\"[\",\"]\")): " +
            Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .collect(Collectors.joining(", ", "[", "]"))
        );//[#6, #6, #10, #10]


        System.out.println("distinct().collect(Collectors.joining(\", \",\"[\",\"]\")): " +
            Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .distinct()
                .collect(Collectors.joining(", ", "[", "]"))
        );


        System.out.println("distinct().collect(toList()): " +
            Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .distinct()
                .collect(Collectors.toList())
        );

        Integer integer3 = 3;
        System.out.println(
            Stream.of(1, 2, 3, 4, 5)
                .filter(i -> i == integer3)
                .findFirst()
        );

        Integer integer127 = 127;
        System.out.println(
            Stream.of(1, 2, 3, 4, 127)
                .filter(i -> i == integer127)
                .findFirst()
        );

        Integer integer128 = 128;
        System.out.println(
            Stream.of(1, 2, 3, 4, 128)
                .filter(i -> i == integer128)
                .findFirst()
        );

        System.out.println(
            Stream.of(1, 2, 3, 4, 128)
                .filter(i -> i.equals(integer128))
                .findFirst()
        );

        System.out.println("filter(i -> i > integer3).count(): " +
            Stream.of(1, 2, 3, 4, 128)
                .filter(i -> i > integer3)
                .count()
        );

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("for (Integer i : numbers): ");
        for (Integer i : numbers) {
            System.out.print("i = " + i + " ");
        }

        System.out.println("\n\nforEach(i -> System.out.println(i)): ");
        Stream.of(1, 2, 3, 4, 5)
            .forEach(i -> System.out.print(i + " "));








    }
}