public class CommandLineString {
    public static void main(String[] args){
            char a=args[0].charAt(0);
            int i=a;
        if(i>65 && i<92){
            System.out.println("No Error");
        }
        else{
            System.out.println("Error");
        }
    }
}