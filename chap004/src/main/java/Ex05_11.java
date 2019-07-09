public class Ex05_11 {

    public static void main(String[] args) {

//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
//            System.out.println("sum = " + sum);
//        }
//        System.out.println("sum = " + sum);


        int i = 1;
        int total = 0;
        while (i <= 100) {
            System.out.println("total = " + total);
            total += i;
            i = i + 1;
        }
        System.out.println("total = " + total);


        char charAA = 'C' - 'A';
        int intA = 'C' - 'A';
        char charA = (char) intA;
        int c = 100;
        char charC = (char) (c - 52);
        System.out.println("charC = " + charC);
        System.out.println("charAA = " + charAA);
        System.out.println("intA = " + intA);
        System.out.println("charA = " + charA);
//test
    }
}
