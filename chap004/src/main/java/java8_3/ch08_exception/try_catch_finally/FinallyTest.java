package java8_3.ch08_exception.try_catch_finally;

public class FinallyTest {
    public static void main(String[] args) {

        try {
            startInstall();
            copyFiles();
//            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }

    }

    private static void deleteTempFiles() {
    }

    private static void copyFiles() {
    }

    private static void startInstall() {

    }
}
