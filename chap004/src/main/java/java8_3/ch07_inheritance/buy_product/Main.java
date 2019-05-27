package java8_3.ch07_inheritance.buy_product;

public class Main {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Product());


    }
}
