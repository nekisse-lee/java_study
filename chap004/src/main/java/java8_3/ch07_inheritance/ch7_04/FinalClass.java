package java8_3.ch07_inheritance.ch7_04;

final class FinalClass {
    private final int MAX_SIZE = 10;

    final int getMaxSize() {
        final int LV =MAX_SIZE;
        return MAX_SIZE;
    }

}

//class FinalChild extends FinalClass {
//
//}
