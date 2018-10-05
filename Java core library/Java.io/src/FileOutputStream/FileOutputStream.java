package FileOutputStream;

public class FileOutputStream {
    public static void main(String[] args){
        try {
            java.io.FileOutputStream stream=new java.io.FileOutputStream("src/FileOutputStream/text.txt");

            String string="Test file output stream!!";

            byte[] bytes=string.getBytes();

            stream.write(bytes);
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
