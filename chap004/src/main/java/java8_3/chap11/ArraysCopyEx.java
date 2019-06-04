package java8_3.chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysCopyEx {
    int[] arr = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        ArraysCopyEx arr = new ArraysCopyEx();
        int[] copyArr = Arrays.copyOf(arr.arr, 4);

        System.out.println(Arrays.toString(copyArr));

        int[] copyOfRange = Arrays.copyOfRange(arr.arr, 1, 3);
        System.out.println(Arrays.toString(copyOfRange));
        int[] tmp = new int[10];
        System.arraycopy(arr.arr, 0, tmp, 0, arr.arr.length);
        System.out.println("tmp = " + Arrays.toString(tmp));

        int[] tmp2 = new int[10];
        int[] tmp3 = new int[10];
        Arrays.fill(tmp2, (int) (Math.random() * 5)+1);
        System.out.println("tmp2 = " + Arrays.toString(tmp2));

        List ints = Arrays.asList(tmp2);

        ArrayList ints1 = new ArrayList<>(Arrays.asList(tmp2));

        int[] arr2 = {3, 1, 5, 2, 4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int binarySearch = Arrays.binarySearch(arr2, 2);
        System.out.println("binarySearch = " + binarySearch);

        System.out.println("\n \n \n ");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//        integers.add(6); 예외 발생

        ArrayList list2 = new ArrayList<>(integers);
        list2.add(6);

        int[] arr11 = {3, 1, 5, 2, 7, 9};
        System.out.println(Arrays.binarySearch(arr11, 2));
        Arrays.sort(arr11);
        System.out.println("Arrays.toString(arr11) = " + Arrays.toString(arr11));

        System.out.println(Arrays.binarySearch(arr11, 2));



    }

}
