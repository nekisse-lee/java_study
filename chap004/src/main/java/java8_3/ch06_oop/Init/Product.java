package java8_3.ch06_oop.Init;

public class Product {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public Product() {
    }

}
class ProductTest {
    public static void main(String[] args) {
        final Product p1 = new Product();
        System.out.println("Product.count = " + Product.count);
        final Product p2 = new Product();
        System.out.println("Product.count = " + Product.count);
        final Product p3 = new Product();
        System.out.println("Product.count = " + Product.count);

        System.out.println("p1.serialNo = " + p1.serialNo);
        System.out.println("p2.serialNo = " + p2.serialNo);
        System.out.println("p3.serialNo = " + p3.serialNo);

        System.out.println("Product.count = " + Product.count);
    }

}
