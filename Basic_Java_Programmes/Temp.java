import java.util.Scanner;
public class Temp {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A temperature in fahrenheit:");
        double a= sc.nextDouble();
        System.out.println("Temperature in Celcuis"+(a-32)*(5/9.0));

    }
    
}
