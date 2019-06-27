package java8_3.ch06_oop;

public class CarInstanceInit {
    private int count;
    private int serialNo;
    private String color;
    private String gearType;
    static {
        System.out.println("스태틱 초기화블럭");
    }

    {
        System.out.println("인스턴스 초기화블럭");
        count++;
        serialNo = count;
    }

    public CarInstanceInit() {
        color = "white";
        gearType = "Auto";
    }

    public CarInstanceInit(String color, String gearType) {

        this.color = color;
        this.gearType = gearType;
    }

    @Override
    public String toString() {
        return "CarInstanceInit{" +
            "count=" + count +
            ", serialNo=" + serialNo +
            ", color='" + color + '\'' +
            ", gearType='" + gearType + '\'' +
            '}';
    }

    public static void main(String[] args) {
        System.out.println("carInstanceInit 생성");
        CarInstanceInit carInstanceInit = new CarInstanceInit();
        System.out.println(carInstanceInit);
        System.out.println("carInstanceInit22 생성");
        CarInstanceInit carInstanceInit2 = new CarInstanceInit("red","transmission");
        System.out.println(carInstanceInit2);



    }

}


