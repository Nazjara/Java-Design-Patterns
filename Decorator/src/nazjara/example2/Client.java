package nazjara.example2;

import java.io.*;

public class Client {

    public static void main(String[] args) {
        int c;

        StringBuffer sb = new StringBuffer("THIS IS UPPERCASE TEXT");
        byte[] bytes = sb.toString().getBytes();

        try(InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes))) {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
