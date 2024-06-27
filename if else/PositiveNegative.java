import java.util.Scanner;
public class PositiveNegative{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        float a=sc.nextFloat();
        if(a>0){
            System.out.println("No. is positive");
        }
        else if(a==0){
            System.out.println("No. is 0");
        }
        else{
            System.out.println("No. is negative");
        }
    }
}