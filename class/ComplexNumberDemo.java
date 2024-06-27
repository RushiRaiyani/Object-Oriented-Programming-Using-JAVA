import java.util.Scanner;
class ComplexNumber{
    int real;
    int imag;
    public ComplexNumber(){
        this.real = 0;
        this.imag = 0;
    }
    public ComplexNumber(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    void printSum(ComplexNumber complexNo1,ComplexNumber complexNo2){
        int ans;
        int ans2;
        ans2=complexNo1.imag+complexNo2.imag;
        ans=complexNo1.real+complexNo2.real;
        System.out.println(ans+"+"+ans2+"i");
    }
}
public class ComplexNumberDemo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a complex number");
    int real1 = sc.nextInt();
    int imag1 = sc.nextInt();
    System.out.println("Enter a complex number2");
    ComplexNumber complexNo1 = new ComplexNumber(real1,imag1);
    int real2 = sc.nextInt();
    int imag2 = sc.nextInt();
    ComplexNumber complexNo2 = new ComplexNumber(real2,imag2);
    complexNo1.printSum(complexNo1,complexNo2);
}    
}