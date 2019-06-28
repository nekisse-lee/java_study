package thisisjava.chap11.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

    public static void main(String[] args) {

        HashMap<Key, String > hashMap = new HashMap<>();
        hashMap.put(new Key(1), "홍길동");
        Key key = new Key(1);
        String value = hashMap.get(key);
        System.out.println(value);





    }
}
