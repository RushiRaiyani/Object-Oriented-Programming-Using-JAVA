public class CommandLineSum {
    public static void main(String[] args) {
        double sum2=0;
        for(int i=0;i<args.length;i++){
            double sum=Double.parseDouble(args[i]);
            sum2=sum2+sum;
        }
        System.out.println(sum2);
    }
}