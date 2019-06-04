package java8_3.chap11;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 7, 9};
        System.out.println("arr.toString() = " + arr.toString());
        System.out.println("arr = " + arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr) + "\n");

        int[][] arr2 = {{1,2,3,4,5},{1,2,3,4,5}};
        System.out.println("arr2.toString() = " + arr2.toString());
        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2) + "\n");
        
        int[][] arr3 = {{1,2,3,4,5},{1,2,3,4,5}};

        System.out.println(Arrays.deepToString(arr2));
        System.out.println("arr2[0].length = " + arr2[0].length);
        System.out.println("arr2[1].length = " + arr2[1].length);
        System.out.println();
        System.out.println("arr2.equals(arr3) = " + arr2.equals(arr3));
        System.out.println("Arrays.equals(arr2,arr3) = " + Arrays.equals(arr2, arr3));

        System.out.println("Arrays.deepEquals(arr2,arr3) = " + Arrays.deepEquals(arr2, arr3));

    }


}
