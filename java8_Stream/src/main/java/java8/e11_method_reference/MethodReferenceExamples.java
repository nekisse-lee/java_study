package java8.e11_method_reference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
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
        System.out.println("\n===============================");
        System.out.println("methodReference03()");
        System.out.println("---------------------------------");
        methodReference03();
    }


    private static boolean test(String x) {
        return x.equals("c");
    }

    private static void methodReference03() {
        /* First Class Function
        /*
        * Function can be passed as a parameter to another function.
        */
        /* Using Lambda Expression
         */
        System.out.println(testFirstClassFunction1(3, i -> String.valueOf(i * 2)));
        /*
         * Using Lambda Expression
         */
        System.out.println(testFirstClassFunction1(3, MethodReferenceExamples::doubleThenToString));
        /*
         *  A function can be returned as the result of another function.
         */
        /*
         *  Using Lambda Expression
         */
        final Function<Integer, String> fl = getDoubleThenToStringUsingLambdaExpression();
        final String resultFromFl = fl.apply(3);
        System.out.println(resultFromFl);
        /*
         *  Using Method Reference
         * */
        Function<Integer, String> fmr = getDoubleThenToStringUsingMethodReference();
        final String resultFromFmr = fmr.apply(3);
        System.out.println(resultFromFmr);


        System.out.println("\n---------------------------------");
        /*
         * A function can be stored in the data structure.
         */
        /*
         * Using Lambda Expression
         */
        final List<Function<Integer, String>> fsl = Arrays.asList(i -> String.valueOf(i * 2));
        for (final Function<Integer, String> f : fsl) {
            final String result = f.apply(3);
            System.out.println(result);
        }

        /*
        * Using Method Reference
        * */
        final List<Function<Integer, String>> fsMr = Arrays.asList(MethodReferenceExamples::doubleThenToString);
        for (Function<Integer, String> f : fsMr) {
            final String result = f.apply(3);
            System.out.println(result);
        }



        System.out.println("\n---------------------------------");
        /*
        *  Using Lambda Expression
        * */
        final Function<Integer, String> fl2 = i -> String.valueOf(i * 2);
        String resultFl2 = fl2.apply(5);
        System.out.println(resultFl2);

        /*
         *  Method Reference
         * */
        final Function<Integer, String> fmr2 = MethodReferenceExamples::doubleThenToString;
        String resultFmr2 = fmr2.apply(5);
        System.out.println(resultFmr2);


        System.out.println("\n---------------------------------");
        /*
        * Both Lambda Expression And Method Reference
        * */
        final List<Function<Integer, String>> fsBoth = 
            Arrays.asList(
                i -> String.valueOf(i * 2),
                MethodReferenceExamples::doubleThenToString,
                MethodReferenceExamples::addHashPrefix
            );

        for (Function<Integer, String> f : fsBoth) {
            String result = f.apply(7);
            System.out.println(result);
        }
    }

    private static Function<Integer, String> getDoubleThenToStringUsingMethodReference() {
        return MethodReferenceExamples::doubleThenToString;
    }


    private static String doubleThenToString(int i) {
        return String.valueOf(i * 2);
    }

    private static String addHashPrefix(int number) {
        return "#" + number;
    }

    private static String testFirstClassFunction1(int n, Function<Integer, String> function) {
        return "The result is " + function.apply(n) + ".";
    }

    private static Function<Integer, String> getDoubleThenToStringUsingLambdaExpression() {
        return i -> String.valueOf(i * 2);
    }
}

class BigDecimalUtil {
    public static int compare(BigDecimal bd1, BigDecimal bd2) {
        return bd1.compareTo(bd2);
    }
}

