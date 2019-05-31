package java8_3.ch08_exception.try_catch;

public class ExceptionEx7 {
    public static void main(String[] args) {

        try {
            throw new Exception(); //강제익셉션
        } catch (Exception e) {
            System.out.println("Exception이 발생");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
