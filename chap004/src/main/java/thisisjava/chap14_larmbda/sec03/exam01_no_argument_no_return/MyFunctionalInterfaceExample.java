package thisisjava.chap14_larmbda.sec03.exam01_no_argument_no_return;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {

        MyFunctionalInterface fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };

        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();

        fi = () -> {
            System.out.println("method call3");
        };

        fi.method();

        fi = new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("method call4");
            }
        };
        fi.method();
    }


}
