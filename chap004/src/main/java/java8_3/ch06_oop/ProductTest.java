package java8_3.ch06_oop;

public class ProductTest {
    static int count = 0;
    int serialNo;

    {
        count++;
        serialNo = count;
    }

    public ProductTest() {
        ++count;
    }

    @Override
    public String toString() {
        return "ProductTest{" +
            "serialNo=" + serialNo +
            '}';
    }

    public static void main(String[] args) {
        ProductTest productTest1 = new ProductTest();
        ProductTest productTest2 = new ProductTest();
        ProductTest productTest3 = new ProductTest();
        System.out.println(productTest1);
        System.out.println(productTest2);
        System.out.println(productTest3);
    }
}
