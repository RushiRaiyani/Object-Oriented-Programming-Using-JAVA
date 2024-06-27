/* Write a complete program to accept N integer numbers from the 
command line. Raise and handle exceptions for following cases :
a. - when a number is –ve
b. - when a number is evenly divisible by 10
c. - when a number is greater than 1000 and less than 2000
d. - when a number is greater than 7000
Skip the number if an exception is raised for it, otherwise add it 
to find total sum. */
package Exception;

import java.util.Scanner;

public class SumException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        try {
            for (int i = 0; i < args.length; i++) {
                n = Integer.parseInt(args[i]);
                if (n < 0) {
                    throw new Exception("Negative Number not allowed for now");
                } else if (n % 10 == 0) {
                    throw new Exception("Number Divisible by 10 is not allowed for now");
                } else if (n > 1000 && n < 2000) {
                    throw new Exception("Number Between 1000 and 2000 is not allowed for now");
                } else if (n > 7000) {
                    throw new Exception("Number greater than 7000 is not allowed for now");
                }
            }
            System.out.println("Sum is:" + sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}