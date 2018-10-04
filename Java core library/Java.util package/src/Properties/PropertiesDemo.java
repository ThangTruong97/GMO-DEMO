package Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        /*Properties properties=new Properties();

         properties.setProperty("name","Truong Quoc Thang");
         properties.setProperty("email","thang@gmail.com");
         //Create properties file name info.properties
        try {
            properties.store(new FileWriter("info.properties"),"Create properties file");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Properties properties1=new Properties();

        properties1.setProperty("greeting","My name is Thang");

        properties1.store(new FileWriter("MessageBundle_en_US.properties"),"English version");

        Properties properties2=new Properties();

        properties2.setProperty("greeting","Tôi tên là Thắng");

        properties2.store(new FileWriter("MessageBundle_vi_VN.properties"),"Vietnamese version");
    }
}
