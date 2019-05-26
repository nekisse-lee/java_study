package java8_3.ch06_oop;

class Data {
    int x;
}

public class ParameterTest {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("d.x = " + d.x);


        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println(d.x);

    }

    private static int change(int x) {
         x = 1000;
        System.out.println("change() : x = " + x);
        return x;
    }

}
