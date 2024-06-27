/* Write a program that illustrates interface inheritance. Interface 
A is extended by A1 and A2. Interface A12 inherits from both A1 
and A2.Each interface declares one constant and one method. Class 
B implements A12.Instantiate B and invoke each of its methods. 
Each method displays one of the constants */

interface A {
    final int a = 10;

    void display();
}

interface A1 extends A {
    final int a1 = 20;

    void display();
}

interface A2 extends A {
    final int a2 = 30;

    void display();
}

interface A12 extends A1, A2 {
    final int a12 = 40;

    void display();
}

class B implements A12 {
    public void display() {
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a12);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        B b1 = new B();
        b1.display();
    }
}
