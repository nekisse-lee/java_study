package thisisjava.chap14_larmbda.sec05.exam08_and_or_negate_iseqal;

import java.util.function.Predicate;

public class PredicateIsEqualsExample {
    public static void main(String[] args) {
        Predicate<String> predicate;

        predicate = Predicate.isEqual(null);
        System.out.println("null, null: " + predicate.test(null));


        predicate = Predicate.isEqual("Java8");
        System.out.println("null, Java8: " + predicate.test(null));

        predicate = Predicate.isEqual("null");
        System.out.println("null, Java8: " + predicate.test("Java8"));

        predicate = Predicate.isEqual("Java8");
        System.out.println("Java8, Java8: " + predicate.test("Java8"));
    }




}
