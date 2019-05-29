package java8_3.ch07_inheritance.buy_product;

public class Product {
    private int price;
    private int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);

    }


    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}
