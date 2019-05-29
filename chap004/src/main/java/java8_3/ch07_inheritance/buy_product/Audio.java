package java8_3.ch07_inheritance.buy_product;

public class Audio extends Product {

    public Audio() {
        super(300);
    }

    @Override
    public String toString() {
        return "AUDIO";
    }
}
