import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        System.out.println("Length of String is:" + s.length());
        for (int i = (s.length() / 2); i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }
}
