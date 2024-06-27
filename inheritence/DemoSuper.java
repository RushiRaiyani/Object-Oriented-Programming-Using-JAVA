//Demonstrate the use of Super Keyword.
package inheritence;

class A {
    int a = 100;
}

class B extends A {
    int a = 10;

    public void print() {
        int a = 1;
        System.out.println("variable in subclass,inside method: " + a);
        System.out.println("variable in subclass outside subclass method with this keyword: " + this.a);
        System.out.println("varaible in base class with super from sub class: " + super.a);
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        B obj = new B();
        obj.print();
    }
}
