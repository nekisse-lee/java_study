package thisisjava.chap14_larmbda.sec03.exam02_return_parameter;

public class MyFunctionalReturnInterFaceExample {
    public static void main(String[] args) {


        MyFunctionalReturnInterFace fi = new MyFunctionalReturnInterFace() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result = fi.add(1, 2);
        System.out.println("result = " + result);

        fi = (x, y) -> x + y;
        int add = fi.add(1, 3);
        System.out.println("add :  " + add);


    }


}
