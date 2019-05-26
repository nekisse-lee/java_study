package java8_3.ch06_oop;

public class TestCalss {
    void instanceMethod(){}

    static void staticMethod(){}

    void instanceMethod2() {
        instanceMethod();
        staticMethod();
    }

    static void staticMethod2() {
        //instanceMethod();  인스턴스메서드 호출 불가.
        staticMethod();
        staticMethod2();
    }
}
