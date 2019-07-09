package thisisjava.chap14_larmbda.sec05.exam03_supplier;

import java.util.Random;
import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String[] args) {

        IntSupplier intSupplier = () ->{
            int num = new Random().nextInt(6) + 1;
            return num;
        };

        for (int i = 0; i < 20; i++) {
            int asInt = intSupplier.getAsInt();
            System.out.println("asInt = " + asInt);
        }





    }

}
