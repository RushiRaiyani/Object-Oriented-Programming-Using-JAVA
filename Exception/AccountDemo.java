/* WAP to create Account class, which is representing a bank account 
where we can deposit and withdraw money. if we want to withdraw 
money which exceed our bank balance? We will not be allowed, create 
InSufficientFundException to handle above situation and display 
proper error message. */
package Exception;

import java.util.Scanner;

class InSufficientFundException extends Exception {
    public InSufficientFundException(String message) {
        super(message);
    }
}

class Account {
    Scanner sc = new Scanner(System.in);
    int bal = 5000;
    int input;
    int dep;
    int withdraw;

    Account() {
        System.out.println("Your bank balance is 5000");
    }

    void ask() {
        System.out.println("Enter 1 for deposite and 2 for withdraw:");
        input = sc.nextInt();
        if (input == 1) {
            System.out.println("Enter an amount you want to deposite:");
            dep = sc.nextInt();
            bal = bal + dep;
            System.out.println("Your new bank balance is now:" + bal);
        } else if (input == 2) {
            System.out.println("Enter amount you want to withdraw:");
            withdraw = sc.nextInt();
            try {
                if (withdraw > bal) {
                    throw new InSufficientFundException("you have insufficient funds");
                } else {
                    bal = bal - withdraw;
                    System.out.println("Your new bank balance is now:" + bal);
                }
            } catch (InSufficientFundException ife) {
                System.out.println(ife.getMessage());
            }

        }
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account a = new Account();
        a.ask();
    }

}
