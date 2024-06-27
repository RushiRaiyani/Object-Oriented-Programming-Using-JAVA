import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a=sc.nextInt();
        for(int i=2;i<a;i++){
            if(a%i==0){
               a=0;
               break;
            }
        }
        if(a==0){
            System.out.println("Number entered is Not Prime");
        }
        else{
            System.out.println("Number entered is Prime");
        }

    }
    
}
