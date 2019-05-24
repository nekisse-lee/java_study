package java8_3.ch06_oop;

public class ExTv {

    public static void main(String[] args) {

        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        tv1.channerUp();
        System.out.println("tv1.getChannel() = " + tv1.getChannel());
        System.out.println("tv2.getChannel() = " + tv2.getChannel());
        tv2 = tv1;
        System.out.println("tv2.getChannel() = " + tv2.getChannel());

        tv1.channerUp();

        System.out.println("tv2.getChannel() = " + tv2.getChannel());
        System.out.println("tv1.getChannel() = " + tv1.getChannel());

        tv2.channerUp();
        System.out.println("tv2.getChannel() = " + tv2.getChannel());
        System.out.println("tv1.getChannel() = " + tv1.getChannel());
        tv1.channerUp();
        System.out.println();
        System.out.println("tv2.getChannel() = " + tv2.getChannel());
        System.out.println("tv1.getChannel() = " + tv1.getChannel());
        tv2 = new Tv();
        tv2.channerUp();
        System.out.println("tv2.getChannel() = " + tv2.getChannel());
        System.out.println("tv1.getChannel() = " + tv1.getChannel());
    }
}
