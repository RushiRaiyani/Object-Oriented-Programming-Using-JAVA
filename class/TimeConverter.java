import java.util.Scanner;
class Time{
    int hour;
    int min;
    Time(){
        this.hour=12;
        this.min=30;
    }
    Time(int hour,int min){
        this.hour=hour;
        this.min=min;
    }
    void add(Time t){
        int x;
        int h=this.hour+t.hour;
        int m=this.min+t.min;
        if(m>60){
            x=m/60;
            m=m%60;
            h=h+x;
        }
        System.out.println("Hours:" + h);
        System.out.println("Minutes:" + m);
    }
}
public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hours and Minutes:");
        int hour=sc.nextInt();
        int min=sc.nextInt();
        Time t1=new Time();
        Time t2=new Time(hour,min);
        t1.add(t2);
    }
   
}

