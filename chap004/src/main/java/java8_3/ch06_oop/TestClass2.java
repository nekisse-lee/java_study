package java8_3.ch06_oop;

public class TestClass2 {
    int iv = 1;
    static int cv = 2;

    void instanceMethod() {
        System.out.println("instanceMethod iv = " + iv);
        System.out.println("instanceMethod cv = " + cv);
    }


    static void staticMethod() {
        //System.out.println("iv = " + iv);
        System.out.println("staticMethod cv = " + cv);
    }

    public static void main(String[] args) {
        final TestClass2 testClass2 = new TestClass2();
        testClass2.instanceMethod();
        TestClass2.staticMethod();
    }
}
