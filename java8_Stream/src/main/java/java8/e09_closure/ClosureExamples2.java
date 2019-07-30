package java8.e09_closure;

public class ClosureExamples2 {

    private int number = 999;

    public static void main(String[] args) {
        new ClosureExamples2().test();

    }

    private  void test() {
//        int number = 100;

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println(number);
            }
        };
        runnable.run();

        Runnable runnable1 = () -> System.out.println(number);
        runnable1.run();


        //anonymous class는  **추가한 갯수 만큼 **  class파일이 생성이 된다.

        // vs

        // 람다는 class가 추가되지않고 레서피가 추가, 캐시를 해놓음 = 속도가 빠름
    }

}
