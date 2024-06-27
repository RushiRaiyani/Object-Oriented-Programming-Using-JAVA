public class Pattern5 {
    public static void main(String[] args){
        byte i,j;
        for(i=1;i<=5;i++){
       for(j=1;j<=5-i;j++){
            System.out.print(" ");
        }
        for(j=1;j<=2*i-1;j++){
            if(j%2==1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
}
}