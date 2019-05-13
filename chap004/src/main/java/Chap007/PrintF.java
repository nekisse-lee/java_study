package Chap007;

public class PrintF {
    public static void main(String[] args) {
        int age = 12;
        System.out.printf("age : %d \n", 14);
        System.out.printf("age : %d \n", age);
        System.out.printf("age: %d, %d %n", 14, age);
        System.out.printf("age: %d, %d \n", 14, age);

        int finger = 10;
        System.out.printf("finger = [%5d] \n", finger);
        System.out.printf("finger = [%10d] \n", finger);
        System.out.printf("finger = [%01" + "10d] \n", finger);


    }
}
