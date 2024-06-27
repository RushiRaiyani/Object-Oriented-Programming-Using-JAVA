import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        byte n=sc.nextByte();
        int m=0;
        for(int i=1;i<=n*2;i++){
            if(i<=n){
            for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                }else{
                    for(int k=n-1;k>=m;k--){
                        System.out.print("*");
                    }
                    m++;
                }   
                System.out.println("");       
        }
    }   
}