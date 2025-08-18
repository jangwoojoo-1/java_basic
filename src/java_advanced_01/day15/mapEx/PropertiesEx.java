package java_advanced_01.day15.mapEx;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        //properties 객체 생성
        Properties p = new Properties();
        p.load(PropertiesEx.class.getResourceAsStream("database.properties"));

        String driver = p.getProperty("driver");
        System.out.println(driver);
    }
}
