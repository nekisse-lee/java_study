package java8_3.ch06_oop;

public class MyMath2 {

    long a;
    long b;

    private long add() {
        return a + b;
    }

    private static long add(long a, long b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyMath2 myMath2 = new MyMath2();
        myMath2.a = 10;
        myMath2.b = 20;
        long instanceAdd = 0;
        instanceAdd = myMath2.add();

        System.out.println("instanceAdd = " + instanceAdd);

        final long staticAdd = MyMath2.add(1, 2);
        System.out.println("staticAdd = " + staticAdd);

        final long staticAdd2 = MyMath2.add(3, 4);
        System.out.println("staticAdd2 = " + staticAdd2);
        myMath2.a = 30;
        myMath2.b = 40;
        instanceAdd = myMath2.add();
        System.out.println("instanceAdd = " + instanceAdd);

    }
}
