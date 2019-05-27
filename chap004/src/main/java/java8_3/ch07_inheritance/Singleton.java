package java8_3.ch07_inheritance;

final class Singleton {
    private static Singleton singleton = new Singleton();
    int x = 0;

    private Singleton() {
        this.x = 10;
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        final Singleton instance = Singleton.getInstance();

        final Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);

        System.out.println(instance.x == 20);
    }
}
