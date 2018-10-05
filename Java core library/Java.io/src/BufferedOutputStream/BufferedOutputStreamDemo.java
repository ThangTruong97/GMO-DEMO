package BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
    public static void main(String[] args){
        try {
            FileOutputStream stream=new FileOutputStream("src/BufferedOutputStream/text.txt");
            BufferedOutputStream buffered=new BufferedOutputStream(stream);
            String string="Test buffered output stream!!";
            byte[] bytes=string.getBytes();
            buffered.write(bytes);
            buffered.flush();
            buffered.close();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
