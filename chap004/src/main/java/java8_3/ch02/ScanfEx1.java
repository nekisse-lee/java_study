package java8_3.ch02;

import java.util.Scanner;

public class ScanfEx1 {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int num2 = scanner.nextInt();

        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        String input = scanner.nextLine();
        int inputStrNum = Integer.parseInt(input);
        System.out.println("inputStrNum = " + inputStrNum);
    }
}
