package java8.e11_method_reference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MethodReferenceExamples {

    public static void main(String[] args) {

        Arrays.asList(1, 2, 3, 4, 5)
//            .forEach(i -> System.out.println(i));
            .forEach(System.out::println);
        System.out.println(Arrays.asList((new BigDecimal("10.0")), new BigDecimal("23"), new BigDecimal("5"))
            .stream()
//            .sorted((o1, o2) -> o1.compareTo(o2))
            .sorted(BigDecimalUtil::compare)
            .collect(Collectors.toList()
            ));

        System.out.println(Arrays.asList((new BigDecimal("10.0")), new BigDecimal("23"), new BigDecimal("5"))
            .stream()
            .sorted(BigDecimal::compareTo)
            .collect(Collectors.toList()
            ));


        final String targetString = "c";
        System.out.println(Arrays.asList("a", "b", "c", "d")
            .stream()
//            .anyMatch(String::equals)
            .anyMatch(targetString::equals)
//            .anyMatch(x -> x.equals("c"))
        );


    }

    private static boolean test(String x) {
        return x.equals("c");
    }
}

class BigDecimalUtil {
    public static int compare(BigDecimal bd1, BigDecimal bd2) {
        return bd1.compareTo(bd2);
    }
}

