/*
The Transport interface declares a deliver () method. The abstract 
class Animal is the super class of the Tiger, Camel, Deer and 
Donkey classes. The Transport interface is implemented by the 
Camel and Donkey classes. Write a test program that initialize an 
array of four Animal objects. If the object implements the 
Transport interface, the deliver () method is invoked.
 */



interface Transport {
    public void deliver();
}

abstract class Animal {
    abstract void timepass();
}

class Tiger extends Animal {
    public void timepass() {
        System.out.println("Timepass Tiger ");
    }
}

class Camel extends Animal implements Transport {
    public void deliver() {
        System.out.println("Hello...Camel here");
    }

    public void timepass() {
        System.out.println("Timepass Camel ");
    }
}

class Deer extends Animal {
    public void timepass() {
        System.out.println("Timepass Deer ");
    }
}

class Donkey extends Animal implements Transport {
    public void deliver() {
        System.out.println("Hello...Donkey here");
    }

    public void timepass() {
        System.out.println("Timepass Donkey ");
    }
}

public class TransportInterfaceDemo {
    public static void main(String[] args) {
        Animal[] arr = new Animal[4];
        arr[0] = new Tiger();
        arr[1] = new Camel();
        arr[2] = new Deer();
        arr[3] = new Donkey();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Transport) {
                ((Transport) arr[i]).deliver();
            } else {
                arr[i].timepass();
            }
        }

    }
}