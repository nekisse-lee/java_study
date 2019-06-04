package java8_3.chap11.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {

        Properties p = new Properties();
//        p.setProperty("autosave", "5");
//        p.setProperty("language", "한글");
//        p.setProperty("timeout", "10");

        System.out.println("p = " + p);
//        System.out.println(p.getProperty("autosave").getClass().getTypeName());

        System.out.println("p.getProperty(\"autosave\") = " + p.getProperty("autosave"));

        System.out.println("p.getOrDefault(\"autosave\",\"0\") = " + p.getOrDefault("autosave", "0"));
        System.out.println("p.getOrDefault(\"autosave222\",\"0\") = " + p.getOrDefault("autosave222", "0"));

        p.list(System.out);

        try {
            p.load(new FileInputStream("/Users/nekisse/Desktop/output.txt"));
            System.out.println(p);

            p.store((new FileOutputStream("/Users/nekisse/Desktop/output.txt")), "Properties Example .txt");
            p.storeToXML(new FileOutputStream("output.xml"), "Properties Example .xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;


    }
}
