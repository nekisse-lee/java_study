package java8_3.ch08_exception.try_catch;

public class ExceptionEx11 {
    public static void main(String[] args) {

        System.out.println(1);

        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
            }
            System.out.print("ae.printStackTrace = ");
            ae.printStackTrace();
            System.out.println("ae.getMessage  = " + ae.getMessage());
            System.out.println(ae.getClass().getSimpleName());
            System.out.println(ae.getClass().getName());
            System.out.println(ae.getClass().getTypeName());
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getClass().getName());
            System.out.println(e.getClass().getTypeName());

        }
        System.out.println(6);

    }
}
