package thisisjava.chap11.exam06_finalize;

public class FinalizeExample {

    public static void main(String[] args) {


        for (int i = 1; i <= 50; i++) {
            Counter counter = new Counter(i);
            counter = null;
            System.gc();
        }
    }


}
