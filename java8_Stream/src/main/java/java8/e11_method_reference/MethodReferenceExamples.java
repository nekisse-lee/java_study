package java8.e11_method_reference;

import java.util.Arrays;

public class MethodReferenceExamples {

    public static void main(String[] args) {

        Arrays.asList(1, 2, 3, 4, 5)
            .forEach(i -> System.out.println(i));


    }
}
