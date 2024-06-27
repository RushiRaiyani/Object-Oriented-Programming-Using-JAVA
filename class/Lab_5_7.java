class Check {
    int a;
    int b;
    static int c;

    public Check(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Non-static variable accessed with THIS keyword:" + a);
        System.out.println("Non-static variable accessed with THIS keyword:" + b);
        System.out.println("static variable accessed with THIS keyword:" + c);
    }

    static void print() {
        System.out.println("Static variable Accessed without THIS keyword:" + c);
    }

    void display() {
        System.out.println("Refernce of this is :" + (this) + "");
    }
}

public class Lab_5_7 {
    public static void main(String[] args) {
        Check obj = new Check(10, 20, 30);
        obj.print();
        obj.display();
        System.out.println("Reference of Object is:" + (obj) + ":");
    }
}
