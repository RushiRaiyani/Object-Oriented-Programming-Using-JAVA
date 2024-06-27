import java.util.Scanner;
public class Avg{

    public static void main(String[] args) {
        System.out.println("Enter numbers of terms you want to enter:");
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        double sum=0;
        int l;
        for(int i=1;i<=d;i++){
            System.out.println("enter Element ["+i+"]");
            l=sc.nextInt();
            sum=sum+l;
        }
        sum=sum/d;
        System.out.println("Avg of Numbers is "+sum);
    }
}