/* Write a program that counts number of characters, words, and lines 
in a file. Use exceptions to check whether the file that is read 
exists or not.
 */
package file;

import java.io.*;
import java.util.*;

public class CountWordsLineChar {
    public static void main(String[] args) {
        Scanner sc;
        try {
            int line = 0;
            int countLetter = 0;

            int words = 0;
            File f = new File("./file./lab_10_1./a.txt");
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                line++;
                countLetter = s.length() + countLetter;
                for (int i = 0; i < s.length(); i++) {
                    if ((s.charAt(i) + ("")).equals(" ")) {
                        words++;
                    }
                }

            }
            System.out.println("lines are:" + line);
            System.out.println("letters are:" + countLetter);
            System.out.println("words are:" + words);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
