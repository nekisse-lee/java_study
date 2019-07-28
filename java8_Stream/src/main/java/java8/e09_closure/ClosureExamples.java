package java8.e09_closure;

public class ClosureExamples {
    public static void main(String[] args) {
        final int number = 100;

//        testClosure("Anonymous Class",new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(number);
//            }
//        });



        testClosure("Lambda Expression", () -> System.out.println(number));


    }

    private static void testClosure(String name, Runnable runnable) {
        System.out.println("==========================");
        System.out.println(name + ": ");
        runnable.run();
        System.out.println("==========================");
    }

}
