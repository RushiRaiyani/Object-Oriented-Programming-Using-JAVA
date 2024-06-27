/* Write a method for computing xy doing repetitive multiplication. X 
and y are of type integer and are to be given as command line 
arguments. Raise and handle exception(s) for invalid values of x 
and y.
 */
package Exception;

public class ExcepDemo {
    public static void main(String[] args) {
        int x, y;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            System.out.println(x * y);
        } 

        catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Enter a number");
        }

    }
}