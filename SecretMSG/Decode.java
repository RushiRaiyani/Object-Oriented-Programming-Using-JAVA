
import java.io.*;

public class Decode {
    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("CEAVB-Generated.jpg");
            fis.skip(15228);

            int length = fis.read();
            byte[] byteArray = new byte[length];
            fis.read(byteArray);

            String secretMsg = new String(byteArray);
            System.out.println("Decoded Message: " + secretMsg);

            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}