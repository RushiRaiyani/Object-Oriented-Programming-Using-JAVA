/* The abstract vegetable class has three subclasses named Potato, 
Brinjal and Tomato. Write a java program that demonstrates how to 
establish this class hierarchy. Declare one instance variable of 
type String that indicates the color of a vegetable. Crete and 
display instances of these objects. Override the toString() method 
of object to return a string with the name of vegetable and its 
color. */

abstract class Vegetable {
    String color;
    String name;

    abstract void display();

    Vegetable(String color, String name) {
        this.color = color;
        this.name = name;
    }
}

class Potato extends Vegetable {
    Potato(String color, String name) {
        super(color, name);
    }

    void display() {
        System.out.println("name:" + name + " " + "colour:" + color);
    }
}

class Brinjal extends Vegetable {
    Brinjal(String color, String name) {
        super(color, name);
    }

    void display() {
        System.out.println("name:" + name + " " + "colour:" + color);
    }
}

class Tomato extends Vegetable {
    Tomato(String color, String name) {
        super(color, name);
    }

    void display() {
        System.out.println("name:" + name + " " + "colour:" + color);
    }
}

public class DemoAbstract {
    public static void main(String[] args) {
        Potato p = new Potato("skin", "potato");
        p.display();
        Brinjal b = new Brinjal("Purple", "Brinjal");
        b.display();
        Tomato t = new Tomato("Red", "Tomato");
        t.display();
    }
}
