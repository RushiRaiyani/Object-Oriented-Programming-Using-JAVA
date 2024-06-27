import java.util.Scanner;
class Bank_Account{
        int accountNo;
        String userName; 
        String email;
        String accountType;
        double accountBalance;
 
        void getAccountDetails(int no,String user,String email,String account,double balance){
        this.accountNo=no;
        this.userName=user;
        this.email=email;
        this.accountType=account;
        this.accountBalance=balance;
        }
        void displayAccountDetails(){
        System.out.println(accountNo); 
        System.out.println(userName); System.out.println(email);
        System.out.println(accountType);
        System.out.println(accountType);
        }
}
class AccountDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int accountNo;
        String userName; 
        String email;
        String accountType;
        double accountBalance;
        System.out.println("Enter accountNo:");
        accountNo=sc.nextInt(); 
        sc.nextLine();
        System.out.println("Enter username:");
        userName=sc.nextLine();
        System.out.println("Enter accountType:");
        accountType=sc.nextLine();
        System.out.println("Enter email:");
        email=sc.nextLine();
        System.out.println("Enter accountBalance:");
        accountBalance=sc.nextDouble();
                Bank_Account account=new Bank_Account();
        account.getAccountDetails(accountNo,userName,email,accountType,accountBalance);
        account.displayAccountDetails();
    }
}