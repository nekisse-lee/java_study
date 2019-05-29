package java8_3.ch07_inheritance.buy_product;

public class Buyer2Main {
    public static void main(String[] args) {

        final Buyer2 buyer2 = new Buyer2();

        buyer2.buy(new Tv());
        buyer2.buy(new Computer());

        System.out.println("현재 잔액은 " + buyer2.money + "원입니다.");
        System.out.println("현재 보너스 점수는 " + buyer2.bonusPoint + "점 입니다.");


        buyer2.summary();
    }
}
