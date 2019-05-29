package java8_3.ch07_inheritance.buy_product;

public class Tv extends Product {
    public Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "TV";
    }
}
