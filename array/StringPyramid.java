import java.util.Scanner;

public class StringPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String s=sc.next();
   
    for(int i=0;i<s.length();i++){
        for(int j=0;j<=i;j++){
            System.out.print(s.charAt(j));
        }   
        System.out.println("");
     }
    }   
}