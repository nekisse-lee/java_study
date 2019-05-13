public class Ex06_09 {

    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {50, 60, 60, 70},
            {70, 80, 90, 100}
        };


        System.out.println("arr.length = " + arr.length);
        System.out.println("arr[0].length = " + arr[0].length);
        for (int i : arr[0]) {
            System.out.println("i = " + i);
        }
        final int multiplication = multiplication(3, 3);
        System.out.println("multiplication = " + multiplication);

    }

    private static int multiplication(int count, int number) {
        int y = number * number;
        for (int j = 1 + 1; j < count; j++) {
            y = y * number;
            System.out.println("y = " + y);
        }
        return y;
    }


}
