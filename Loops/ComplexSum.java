import java.util.Scanner;

public class ComplexSum {
    public static void main(String[] args) {        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int sum=0;
    int x;
    while((n/10)!=0){
        sum=0;
        while(n!=0){
            x=n%10;
         sum=sum+x;
         n=n/10;
        }
        n=sum;
    }
    System.out.println("Final Sum is "+ sum);
}
}