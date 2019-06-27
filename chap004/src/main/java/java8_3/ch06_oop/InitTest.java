package java8_3.ch06_oop;

public class InitTest {

    static int cv = 1;
    int iv = 2;

    static {
        cv = 11;
        System.out.println("cv = " + cv);
    }

    {
        this.iv = 22222;
        System.out.println("인스턴스 초기화 블럭 iv = " + iv);
    }

    InitTest () {
        iv = 22;
        System.out.println("iv = " + iv);
    }



    public static void main(String[] args) {
        InitTest initTest = new InitTest();
//        System.out.println("initTest.iv = " + initTest.iv);
//        System.out.println("InitTest.cv = " + InitTest.cv);
    }

}
