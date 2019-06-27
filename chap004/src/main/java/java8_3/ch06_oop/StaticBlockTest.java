package java8_3.ch06_oop;

import java.util.Arrays;
import java.util.Random;

public class StaticBlockTest {
    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10)+ 1;
        }

    }

    public static void main(String[] args) {
        System.out.println("arr.st = " + Arrays.stream(arr).iterator().nextInt());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("arr.length = " + arr.length);
    }
}
