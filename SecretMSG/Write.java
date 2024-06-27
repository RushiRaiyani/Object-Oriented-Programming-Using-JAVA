
import java.io.*;

public class Write {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("2.jpg");
            FileOutputStream fos = new FileOutputStream("CEAVB-Generated.jpg");
            int temp = fis.read();
            int counter = 0;

            String secretMsg = "kale bunk marvano che";
            byte[] byteArray = secretMsg.getBytes();

            while (temp > -1) {
                counter++;
                if (counter == 15229) {
                    fos.write(secretMsg.length());
                }
                if (counter >= 15230 && counter < (15230 + byteArray.length)) {
                    fos.write(byteArray[counter - 15230]);
                } else {
                    fos.write(temp);
                    temp = fis.read();
                }

            }

            fos.close();
            fis.close();

            System.out.println("New file created");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}