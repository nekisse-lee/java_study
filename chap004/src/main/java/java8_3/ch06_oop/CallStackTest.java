package java8_3.ch06_oop;

public class CallStackTest {

    public static void main(String[] args) {
        firstMethod();

    }

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
    }

}
