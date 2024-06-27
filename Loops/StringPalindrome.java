import java.util.Scanner;
public class StringPalindrome {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Word:");
    String s=sc.next();
    int l=s.length();
    
    char[] a= new char[l];
    for(int i=0;i<s.length();i++){
        
        a[i]=s.charAt(i);
        if(a[i]==s.charAt(s.length()-i-1)){
            l=1;
        }
        else{
            l=0;
            break;
        }
    }
    
if(l==0){
    System.out.println("String is not plaindrome");
}    
else{
    System.out.println("String is palindrome");
}   
}   
}