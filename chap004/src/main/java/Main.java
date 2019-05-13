public class Main {

    public static void main(String[] args) {

        int x = 0;
        System.out.println("x = " + x);

        double d = 10.5;
        System.out.println("d = " + d);

        int i = (int) 10.5;
        System.out.println("i = " + i);

        if (result(5.1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int year = 0, age = 19;
        year = 2000;

        System.out.println("year + age = " + (year + age));


    }

    public static boolean result(double x) {
        return x * 2 > 10 ? true : false;
    }
}
