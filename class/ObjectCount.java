class Count{
static int give=0;
public Count(){
    give++;
}
}
public class ObjectCount {
    public static void main(String[] args) {
    
    Count obj1= new Count();
    Count obj2= new Count();
    Count obj3= new Count();
    Count obj4= new Count();
    System.out.println(Count.give);
}
}