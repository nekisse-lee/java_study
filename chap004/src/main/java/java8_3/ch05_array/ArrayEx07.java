package java8_3.ch05_array;

public class ArrayEx07 {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5};
        int[] copyNumber = new int[10];

        for (int i = 0; i < number.length; i++) {
            copyNumber[i] = number[i];
            System.out.println("copyNumber["+i+"] = " + copyNumber[i]);
        }

        for (int i = 0; i < copyNumber.length; i++) {
            System.out.println("copyNumber = " + copyNumber[i]);
        }

    }
}
