package java8_3.ch06_oop;

public class Factorial {
    public static void main(String[] args) {

        long result = factorial(4);
        System.out.println(result);
    }

    private static long factorial(int i) {
        long result = 0;
        if (i == 1) {
            result = 1;
        } else {
            System.out.println(i +" = "+ i + " * factorial(" + (i - 1) + ")");
            result = i * factorial(i - 1);
        }
        return result;
    }
}
