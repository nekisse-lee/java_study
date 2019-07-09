package thisisjava.chap14_larmbda.sec05.exam08_and_or_negate_iseqal;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateAndOrNegateExample {

    public static void main(String[] args) {

        // 2 배수를 검사
        IntPredicate predicateA = a -> {
            return a % 2 == 0;
        };

        //3의 배수 검사

        IntPredicate predicateB = value -> value % 3 == 0;

        IntPredicate predicateAB;
        boolean result;

        //and
        predicateAB = predicateA.and(predicateB);

        result = predicateAB.test(9);
        System.out.println("result = " + result);

        //or
        predicateAB = predicateA.or(predicateB);

        result = predicateAB.test(9);
        System.out.println("result = " + result);

        //negate()
        predicateAB = predicateA.negate();
        boolean test = predicateAB.test(9);
        System.out.println("test = " + test);

    }
}
