package java8_3.ch06_oop.contructor;

public class Card {
    private int a;

    public Card() {

    }

    private Card(int a) {
        this.a =  a;
    }

    public static void main(String[] args) {
        final Card card = new Card(9);
        if (card.a != 10) {
            System.out.println("card = " + card.a);
        }
            System.out.println("card.a = " + card.a);
    }
}
