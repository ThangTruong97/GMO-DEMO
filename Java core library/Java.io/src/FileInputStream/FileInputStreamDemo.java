package FileInputStream;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args){
        try {
            FileInputStream stream=new FileInputStream("src/FileInputStream/text.txt");
            int i;
            while ((i=stream.read())!=-1){
                System.out.print((char)i);
            }
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
