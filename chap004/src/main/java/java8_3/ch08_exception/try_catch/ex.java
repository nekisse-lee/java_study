package java8_3.ch08_exception.try_catch;

public class ex {
    public static void main(String[] args) {

        try {
            final Exception exception = new Exception("고의적 익셉션");
            throw exception;
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("종료");

    }
}
