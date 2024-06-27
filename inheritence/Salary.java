/*
Create a class named 'Member' having the following members:
1. Name
2. Age
3. Phone number
4. Address
5. Salary
It also has a method named 'printSalary' which prints the salary 
of the members.
Two classes 'Employee' and Manager' inherits the 'Member' class. 
The 'Employee' and 'Manager' classes have data members 
'specialization' and 'department' respectively. Now assign name, 
age, phone number address and salary to an employee and a manager 
by making an object of both of these classes and print the same 
along with specialization and department respectively.
 */
package inheritence;

import java.util.Scanner;

class Member {
    String Name;
    int Age;
    long PhoneNumber;
    String Address;
    int Salary;

    public Member(String employee) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + employee + " details");
        System.out.println("Enter name:");
        Name = sc.nextLine();
        do {
            System.out.println("Enter Age:");
            Age = sc.nextInt();
        } while (Age > 120);
        do {
            System.out.print("Enter a 10-digit phone number: ");
            PhoneNumber = sc.nextLong();
        } while (String.valueOf(PhoneNumber).length() != 10);
        System.out.println("Enter Address:");
        Address = sc.next();
        System.out.println("Enter Salary:");
        Salary = sc.nextInt();
    }

    void printSalary(String na) {
        System.out.println(na + " details");
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
        System.out.println("PhoneNumber:" + PhoneNumber);
        System.out.println("Address:" + Address);
        System.out.println("Salary:" + Salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String emp) {
        super("employee");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter specialization:");
        specialization = sc.nextLine();
    }

    void printSalary() {
        System.out.println("***********");
        super.printSalary("employee");
        System.out.println("Specialization:" + specialization);
        System.out.println("***********");
    }

}


class Manager extends Member {
    String department;

    public Manager(String emp) {
        super("Manager");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter specialization:");
        department = sc.nextLine();
    }

    void printSalary() {
        System.out.println("***********");
        super.printSalary("Manager");
        System.out.println("Specialization:" + department);
        System.out.println("***********");
    }
}

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee("employee");
        Manager man = new Manager("Manager");
        emp.printSalary();
        man.printSalary();
    }
}
