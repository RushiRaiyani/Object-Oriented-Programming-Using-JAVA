import java.util.Scanner;
public class Calc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Addition,Subtraction,Multiplication or Division:");
        String s=sc.next();
        System.out.println("Enter Number 1:");
        double a=sc.nextDouble();
        System.out.println("Enter a Number 2:");
        double b=sc.nextDouble();
        if(s.equals("Addition") || s.equals("addition")){
            System.out.println("Addition of given numbers is:"+(a+b));
        } 
        else if(s.equals("Subtraction") || s.equals("subtraction")){
            System.out.println("Addition of given numbers is:"+(a-b));
        } 
        else if(s.equals("Multiplication") || s.equals("multiplication")){
            System.out.println("Addition of given numbers is:"+(a*b));
        } 
        else if(s.equals("Division") || s.equals("division")){
            System.out.println("Addition of given numbers is:"+(a/b));
        } 
        else{
            System.out.println("Enter a valid number");
        }
    }
}
