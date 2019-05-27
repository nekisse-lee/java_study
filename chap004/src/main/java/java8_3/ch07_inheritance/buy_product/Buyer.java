package java8_3.ch07_inheritance.buy_product;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    int count = 0;
    Product[] cart = new Product[10];

    void buy(Product product) {
        if (money < product.getPrice()) {
            System.out.println("금액이 모자랍니다.");
            return;
        }
        money -= product.getPrice();
        bonusPoint += product.getBnusPoint();
        cart[count++] = product;
    }

}
