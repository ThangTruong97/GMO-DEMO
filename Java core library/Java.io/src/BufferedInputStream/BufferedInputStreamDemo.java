package BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args){
        try {
            FileInputStream stream=new FileInputStream("src/BufferedInputStream/text.txt");
            BufferedInputStream buffered=new BufferedInputStream(stream);
            int i;
            while ((i=buffered.read())!=-1){
                System.out.print((char)i);
            }
            buffered.close();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
