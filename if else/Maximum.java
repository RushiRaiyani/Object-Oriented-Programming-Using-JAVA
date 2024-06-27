import java.util.Scanner;
public class Maximum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number a:");
        float a=sc.nextFloat();
        System.out.println("Enter a number b:");
        float b=sc.nextFloat();
        System.out.println("Enter a number c:");
        float c=sc.nextFloat();

        if(a>c){
            if(a>b){
                System.out.println("A is largest");
            }
            else if(a==b){
                System.out.println("A and B are same and larger than C");
            }
            else{
                System.out.println("B is largest");
            }
        }
        else if(a<c){
            if(c>b){
                System.out.println("C is largest");
            }
            else if(c==b){
                System.out.println("B and C are same and larger than A");
            }
            else{
                System.out.println("B is largest");
            }
        }
        else{
            if(a>b){
                System.out.println("A and C are same and larger than B");
            }
            else if(a<b){
                System.out.println("B is largest");
            }
            else{
                System.out.println("All numbers are equal");
            }
        }
}    
}