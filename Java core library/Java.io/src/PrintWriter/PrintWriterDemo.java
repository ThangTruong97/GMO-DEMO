package PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args){
        PrintWriter writer1=new PrintWriter(System.out);
        writer1.write("Print out console!!");
        writer1.flush();
        writer1.close();

        try {
            PrintWriter writer2=new PrintWriter("src/PrintWriter/text.txt");
            writer2.write("Print out file!!");
            writer2.flush();
            writer2.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
