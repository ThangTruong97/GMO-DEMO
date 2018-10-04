package ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args){

        ResourceBundle bundle=ResourceBundle.getBundle("ResourceBundle.MessageBundle",Locale.US);
        System.out.println("Greeting in english: "+bundle.getString("greeting"));

        Locale locale=new Locale("vi","VN");
        Locale.setDefault(locale);
        bundle=ResourceBundle.getBundle("ResourceBundle.MessageBundle");
        System.out.println("Greeting in vietnamese: "+bundle.getString("greeting"));
    }
}
