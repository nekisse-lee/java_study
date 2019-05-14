package java8_3.ch02;

public class PrintfEx1 {
    public static void main(String[] args) {
        System.out.println(10.0 / 3);

        System.out.printf("%%d = %d %n", 15);
        System.out.printf("%%o = %o %n", 15);
        System.out.printf("%%x = %x %n", 15);

        System.out.printf("%%d = %d %n", 15);
        System.out.printf("%%o = %#o %n", 15);
        System.out.printf("%%x = %#x %n", 15);

        System.out.printf("%s %n", Integer.toBinaryString(15));

        float f = 123.4567890f;
        double d = 123.456789;
        System.out.println("f = " + f);
        System.out.printf("%f %n", f);
        System.out.println("d = " + d);
        System.out.printf("%%f = %f %n", d);
        System.out.printf("%%e = %e  %n", d);
        System.out.printf("%%g = %g  %n", d);

        System.out.println();

        System.out.printf("[%5d]%n", 10);
        System.out.printf("[%-5d]%n", 10);
        System.out.printf("[%05d]%n", 10);
        System.out.printf("[%5d]%n", 1234567);

        double dd = 1.23456789;
        System.out.printf("%f %n", dd);
        System.out.printf("%14.10f %n", dd);
        System.out.printf("%14.6f %n", dd);
        System.out.printf("%.6f %n", dd);
        System.out.println();
        System.out.printf("[%s] %n","www.nekisse.com");
        System.out.printf("[%20s] %n","www.nekisse.com");
        System.out.printf("[%-20s] %n","www.nekisse.com");
        System.out.printf("[%.10s] %n","www.nekisse.com");




    }
}
