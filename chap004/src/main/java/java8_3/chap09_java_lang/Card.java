package java8_3.chap09_java_lang;

public class Card {
    String kind;
    int number;

    public Card() {
        this("SPADE", 1);
    }

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
            "kind='" + kind + '\'' +
            ", number=" + number +
            '}';
    }
}

class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();
        System.out.println(c1.toString());
        System.out.println(c2.toString());


    }
}