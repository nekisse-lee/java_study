package java8_3.ch05_array;

public class ArrayEx4 {
    public static void main(String[] args) {


        int[] lottoBall = new int[45];

        for (int i = 0; i < lottoBall.length; i++) {
            lottoBall[i] = i + 1;
        }

        int temp = 0;
        int j = 0;

        for (int i = 0; i < 100; i++) {
            j = (int) (Math.random() * 45);
            temp = lottoBall[0];
            lottoBall[0] = lottoBall[j];
            lottoBall[j] = temp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(lottoBall[i] + " ");

        }

    }
}
