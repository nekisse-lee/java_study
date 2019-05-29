package java8_3.ch07_inheritance.buy_product;

import java.util.Vector;

public class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;

    int count = 0;
//    Product[] cart = new Product[10];


    public Buyer2() {
        System.out.println("가진돈 : " + money);
        System.out.println("현재 보너스 : " + bonusPoint);

    }

    Vector cart = new Vector();

    @SuppressWarnings("Duplicates")
    void buy(Product product) {
        if (money < product.getPrice()) {
            System.out.println("금액이 모자랍니다.");
            return;
        }
        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        cart.add(product);
    }

    void summary() {
        int sum = 0;
        String carList = "";
        if (cart.isEmpty()) {
            System.out.println("구입한 제품이 없습니다.");
            return;
        }

        for (int i = 0; i < cart.size(); i++) {
            Product p = (Product) cart.get(i);
            sum += p.getPrice();
            carList += (i == 0) ? "" + p : ", " + p;
        }

        System.out.println("구입하신 물품의 총 금액은 " + sum + "원 입니다.");
        System.out.println("구입하신 제품은 " + carList + "입니다.");

    }

}
