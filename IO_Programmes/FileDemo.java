package IO_Programmes;

import java.util.*;
import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        File f = new File(name);
        if (f.exists()) {
            if (f.isFile()) {
                System.out.println("File exist" + f.length());
            } else {
                String[] fileName = f.list();
                for (int i = 0; i < fileName.length; i++) {
                    System.out.println("file" + i + "=" + fileName[i]);
                }
            }
        } else {
            System.out.println("File not exist");
        }

    }
}