package java8_3.ch07_inheritance.buy_product;

public class Computer extends Product {

    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "COMPUTER";
    }
}
