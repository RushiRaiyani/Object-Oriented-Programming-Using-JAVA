import java.util.Scanner;
public class KilometerToMiles {
    public static void main(String[] args){
        System.out.println("Enter Kilometer:");
        Scanner m=new Scanner(System.in);
        Float k=m.nextFloat();
        System.out.println("Miles="+(k * 0.621371));
    }
}