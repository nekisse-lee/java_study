package thisisjava.chap13_generic.sec03.exam01_multi_type_parameter;

public class ProductExample {

    public static void main(String[] args) {

        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트 TV");
        Tv tvModel = product1.getKind();


        Product<Car,String > product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("디젤");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }

}
