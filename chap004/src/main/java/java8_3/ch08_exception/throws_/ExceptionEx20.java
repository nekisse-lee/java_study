package java8_3.ch08_exception.throws_;

public class ExceptionEx20 {
    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 처리");
            System.out.print("e.printStackTrace =  ");
            e.printStackTrace();
        }

    }

    private static void method1() throws Exception {
        throw new Exception();
    }
}
