package java8_3.ch05_array;

public class Ex01 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arrClone = new int[10];
        int[] arr2 = {1, 2, 3, 4, 5, 7};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
            arrClone[i] = arr[i];
        }
        System.out.println(arrClone[1] == arr[1]);

        System.out.println("arr2.length = " + arr2.length);
        System.out.println("arr2.hashCode() = " + arr2.hashCode());
    }
        

}
