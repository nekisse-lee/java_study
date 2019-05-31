package java8_3.ch08_exception.throws_;

public class ExceptionEx18 {
    public static void main(String[] args) throws Exception {

        method1();

    }

    private static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        throw new Exception();
    }
}
