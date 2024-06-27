public class Pattern4 {
    public static void main(String[] args){
        byte i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
