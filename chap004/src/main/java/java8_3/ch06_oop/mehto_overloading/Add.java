package java8_3.ch06_oop.mehto_overloading;

public class Add {
    int add(int a, int b) {
        return a + b;
    }

    long add(long a, long b) {
        return a + b;
    }

    int add(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result +=a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        final Add add = new Add();

        System.out.println("add.add(1,2) = " + add.add(1, 2));

        System.out.println("add.add(1L,2) = " + add.add(1L, 2));

        System.out.println("add.add(new int[]{1,2,3}) = " + add.add(new int[]{1, 2, 3}));
    }


}
