package thisisjava.chap14_larmbda.sec04.exam01_filed;

public class UsingThis {


    public int outterField = 10;


    class Inner {
        public int innerField = 20;

        void method() {
            MyFunctionalInterface fi = () ->{
                System.out.println("outterField = " + outterField);
                System.out.println("UsingThis.this.outterField = " + UsingThis.this.outterField);
                System.out.println("innerField = " + innerField);
                System.out.println("this.innerField = " + this.innerField);

            };
            fi.method();
        }

    }


}
