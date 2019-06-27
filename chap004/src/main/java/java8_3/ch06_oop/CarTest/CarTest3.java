package java8_3.ch06_oop.CarTest;

class Car {
    String color;
    String gearType;
    int door;

    public Car() {
        this("white", "auto", 4);
    }

    public Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
            "color='" + color + '\'' +
            ", gearType='" + gearType + '\'' +
            ", door=" + door +
            '}';
    }
}


public class CarTest3 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(car1);

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        car1.door = 100;
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
    }
}
