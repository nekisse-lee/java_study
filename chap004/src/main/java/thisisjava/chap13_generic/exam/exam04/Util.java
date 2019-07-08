package thisisjava.chap13_generic.exam.exam04;

public class Util {
    /*how1

    public static <K, V> V getValue(Pair<K, V> p, K k) {
        if (p.getK() == k) {
            return p.getV();
        } else {
            return null;
        }
    }*/


    //how2

    public static <P extends Pair<K,V>,K, V> V getValue(P p, K k) {
        if (p.getK() == k) {
            return p.getV();
        } else {
            return null;
        }
    }
}
