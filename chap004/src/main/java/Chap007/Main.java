package Chap007;

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int result = 0;
        result = getMax(a, b);
        System.out.println("result = " + result);

        a = 30;
        b = 40;

        result = getMax(a, b);
        System.out.println("result = " + result);
    }

    static int getMax(int x, int y) {
        int max = 0;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }

}
