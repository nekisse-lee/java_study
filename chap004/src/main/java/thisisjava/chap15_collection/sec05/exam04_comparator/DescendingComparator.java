package thisisjava.chap15_collection.sec05.exam04_comparator;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {


    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.price < o2.price) {
            return 1;
        } else if (o1.price == o2.price) {
            return 0;
        }
        return -1;
    }
}