package java8_3.ch06_oop.contructor;

public class InitTest {
    int x;
    int y = x;

    void method1(int a) {
        int i = a;
        int j = i;
        System.out.println("j = " + j);
    }

    public static void main(String[] args) {
        final InitTest initTest = new InitTest();

        initTest.method1(10);
        System.out.println(initTest.x);
        System.out.println(initTest.y);

        initTest.x = 10;
        System.out.println(initTest.x);
        System.out.println(initTest.y);


        initTest.x = 20;
        initTest.y = 50;
        System.out.println(initTest.x);
        System.out.println(initTest.y);
    }
}
