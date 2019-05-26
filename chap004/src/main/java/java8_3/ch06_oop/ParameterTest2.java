package java8_3.ch06_oop;

class Data2 {
    int x;
}
public class ParameterTest2 {
    public static void main(String[] args) {
        Data2 d2 = new Data2();
        d2.x = 10;
        System.out.println("d2.x = " + d2.x);
        change(d2);

        System.out.print("After change(d2)  = ");
        System.out.println("main() : d2 = " + d2.x);

    }

    private static void change(Data2 d2) {
        d2.x = 1000;
        System.out.println("change(): d2 = " + d2.x);
    }
}
