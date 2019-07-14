package thisisjava.chap14_larmbda.exam.exam05;

import java.util.function.IntBinaryOperator;

public class Lambdaexample {

    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {

        int max = maxOrMin((x, y) -> {
            if (x >= y) {
                return x;
            }
            return y;
        });
        System.out.println("max = " + max);

        int min = maxOrMin((left, right) -> {
            if (left <= right) {
                return left;
            }
            return right;
        });
        System.out.println("min = " + min);

    }
}
