package thisisjava.chap11.exam03_toString;

public class SmartPhoneExample {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("삼성", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println("strObj = " + strObj);

        System.out.println("myPhone = " + myPhone);
    }
}
