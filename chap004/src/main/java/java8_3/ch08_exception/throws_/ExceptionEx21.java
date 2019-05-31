package java8_3.ch08_exception.throws_;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionEx21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String s = scanner.nextLine();
        File f = createFile(s);
        System.out.println(f.getName() + " 파일이 생성되었습니다.");

    }

    private static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않습니다.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

            fileName = "제목없음.txt";
        }finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    private static void createNewFile(File f) {

        try {
            f.createNewFile();
        } catch (IOException e) {

        }

    }
}
