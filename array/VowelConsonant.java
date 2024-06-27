import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        int vowel=0,consonant=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'|| ch=='U' || ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u' ){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("No of vowels is"+vowel);
            System.out.println("No of Consonant is"+consonant);   
    }   
}