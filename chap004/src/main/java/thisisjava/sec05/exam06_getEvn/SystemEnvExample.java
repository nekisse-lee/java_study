package thisisjava.sec05.exam06_getEvn;

public class SystemEnvExample {
    public static void main(String[] args) {

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

//        System.out.println("System.getenv() = " + System.getenv());

    }
}
