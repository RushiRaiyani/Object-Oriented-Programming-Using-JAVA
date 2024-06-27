import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        System.out.println("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            num=num*-1;
        }

        int sum=0,temp;
        int max=num;
        while(num!=0){
            temp=num%10;
            sum=sum*10+temp;
            num=num/10;
        }
        if(sum==max){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}