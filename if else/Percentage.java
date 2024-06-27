import java.util.Scanner;
public class Percentage {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Total numbers of marks in single subject");
        byte tm=s.nextByte();
        
        System.out.println("Enter Marks of Maths:");
        byte m=s.nextByte();
        while(m<0 || m>tm){
             System.out.println("Enter correct marks:");
             m=s.nextByte();
        }

        System.out.println("Enter Marks of C language:");
        byte c=s.nextByte();
        while(c<0 || c>tm){
             System.out.println("Enter correct marks:");
             c=s.nextByte();
        }
        
        System.out.println("Enter Marks of JAVA:");
        byte j=s.nextByte();
        while(j<0 || j>tm){
             System.out.println("Enter correct marks:");
             j=s.nextByte();
        }
        
        System.out.println("Enter Marks of Web Designing:");
        byte w=s.nextByte();
        while(w<0 || w>tm){
             System.out.println("Enter correct marks:");
             w=s.nextByte();
        }
        
        System.out.println("Enter Marks of Python:");
        byte p=s.nextByte();
        while(p<0 || p>tm){
             System.out.println("Enter correct marks:");
             p=s.nextByte();
        }
        
        float sum=(m+c+j+w+p)*100/(5*tm);
        System.out.println("Percentage of student is:"+(sum));

        if(sum>=60){
            System.out.println("First division");
        }
        else if(sum>=50){
            System.out.println("Second division");
        }
        else if(sum>=40){
            System.out.println("Third division");
        }
        else{
            System.out.println("You are fail,Better Luck Next Time");
        }
}
}