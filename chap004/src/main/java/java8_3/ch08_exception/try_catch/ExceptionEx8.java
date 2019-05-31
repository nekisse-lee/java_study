package java8_3.ch08_exception.try_catch;

public class ExceptionEx8 {
    public static void main(String[] args) {


        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("익셉션 발생");
        }
    }
}
