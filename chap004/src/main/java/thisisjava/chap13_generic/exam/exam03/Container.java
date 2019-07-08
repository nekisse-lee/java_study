package thisisjava.chap13_generic.exam.exam03;

public class Container<K, V> {

    private K key;
    private V value;

    public V getValue() {
        return value;
    }


    public K getKey() {
        return this.key;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
