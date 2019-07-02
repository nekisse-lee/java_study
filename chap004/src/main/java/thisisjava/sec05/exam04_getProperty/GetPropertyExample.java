package thisisjava.sec05.exam04_getProperty;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {

        String osName = System.getProperty("os.name");
        System.out.println("osName = " + osName);

        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        String userHome = System.getProperty("user.home");
        System.out.println("userHome = " + userHome);

        Properties props = System.getProperties();
        Set<Object> objects = props.keySet();
        Set<Map.Entry<Object, Object>> entries = props.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println("key : " + entry.getKey()+"      value : " + entry.getValue());
        }

        System.out.println("---------------------");
        System.out.println("---------------------");

        Set<Map.Entry<String, String>> entries1 = System.getenv().entrySet();
        for (Map.Entry<String, String> stringStringEntry : entries1) {
            System.out.println(stringStringEntry.getKey());
        }


        System.out.println("---------------------");
        System.out.println("---------------------");

        for (Map.Entry<String, String> stringStringEntry : entries1) {
            System.out.println(stringStringEntry.getValue() + " ===== " + stringStringEntry.getValue());
        }
    }
}

