import java.util.Scanner;
class AreaCircle{
float area(float rad){
    float ans=(float)3.14*rad*rad;
return ans;
}
}
public class AreaCircleDemo {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        float radius=sc.nextFloat();
        AreaCircle a=new AreaCircle();
        System.out.println("Area of Circle is:");
        System.out.println(a.area(radius));
    }   
}