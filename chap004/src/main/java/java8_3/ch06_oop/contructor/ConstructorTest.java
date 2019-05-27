package java8_3.ch06_oop.contructor;

class Data1 {
    int value;

}

class Data2 {
    int value;



    public Data2(int x) {
        this.value = x;
    }
}
class ConstructorTest {
    public static void main(String[] args) {
        final Data1 data1 = new Data1();
        //    final Data2 data2 = new Data2();  기본생성자 없음.
        final Data2 data2 = new Data2(10);
        System.out.println("data1.value = " + data1.value);
        System.out.println("data2.value = " + data2.value);
    }
}






