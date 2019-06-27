package java8_3.ch06_oop.inheritance;

class Tv {


    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp () {
        ++channel;
    }

    void channerDown() {
        --channel;
    }

}

class CaptionTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}


public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println("ctv.channel = " + ctv.channel);
        ctv.displayCaption("Hello , World");
        System.out.println("ctv.caption = " + ctv.caption);
        System.out.println("ctv.caption = true 로 변경");
        ctv.caption = true;
        ctv.displayCaption("Hello,World");
        System.out.println("ctv.powre = " + ctv.power);
        System.out.println("ctv.power(); = ");
        ctv.power();
        System.out.println("ctv.powre = " + ctv.power);


    }


}
