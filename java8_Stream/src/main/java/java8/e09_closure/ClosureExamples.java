package java8.e09_closure;

@SuppressWarnings("ALL")
public class ClosureExamples {
    private int number = 999;


    public static void main(String[] args) {
//        new ClosureExamples().test1();
//        new ClosureExamples().test2();
        new ClosureExamples().test3();

    }

    public <T> String toString(int number, T value) {
        return "[" + number + "]The value is " + String.valueOf(value) + ".";
    }

    @Override
    public String toString() {
        return "ClosureExamples{" +
            "number=" + number +
            '}';
    }

    private void test1() {
        int number = 100;

        testClosure("Anonymous Class", new Runnable() {
            @Override
            public void run() {
                System.out.println(ClosureExamples.this.number);
            }
        });


        testClosure("Lambda Expression", () -> System.out.println(this.number));

    }

    private void test2() {
        testClosure("Anonymous Class", new Runnable() {
            @Override
            public void run() {
                System.out.println("this.toString(): " + this.toString());
            }
        });

        testClosure("Anonymous Class2", new Runnable() {
            @Override
            public void run() {
                System.out.println("ClosureExamples.this.toString(): " + ClosureExamples.this.toString());
            }
        });

        testClosure("Lambda Expression", () -> System.out.println("this.toString(): " + this.toString()));
    }

    private void test3() {
        System.out.println("\"ClosureExamples calling toString()\" " + toString());
        System.out.println("\"ClosureExamples calling toString(int, String)\" " + toString(1, "Hello"));

        testClosure("Anonymous Class", new Runnable() {
            @Override
            public void run() {
//                System.out.println("toString(int, String): " + toString(1,"Test"));
                System.out.println("toString(int, String): causes compile-time error: ");
                System.out.println("ClosureExamples.this.toString(int, String): " + ClosureExamples.this.toString(1, "Test"));
            }
        });

        testClosure("Lambda Expression", () -> System.out.println("toString(int, String): " +  toString(1,"Test")));

    }

    private void test4() {
        int number = 100;

        testClosure("Anonymous Class", new Runnable() {
            @Override
            public void run() {
                int number = 50;   //no compile time -  error
                System.out.println(number);

            }
        });

        testClosure("Lambda Expression", () -> {
//            int number = 50;      //compile-time error

            System.out.println(number);
        });

    }


    private static void testClosure(String name, Runnable runnable) {
        System.out.println("==========================");
        System.out.println(name + ": ");
        runnable.run();
        System.out.println("==========================");
    }

}
