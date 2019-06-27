package java8_3.ch06_oop;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //    static int cv2 = iv;
    static int cv2 = new MemberCall().iv;

    private static void staticMethod1() {
        System.out.println("cv = " + cv);
//        System.out.println(iv);
        System.out.println("new MemberCall().iv = " + new MemberCall().iv);
    }

    public static void main(String[] args) {
        staticMethod1();
    }

}
