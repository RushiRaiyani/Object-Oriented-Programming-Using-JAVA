/* Create interface EventListener with performEvent() method. Create 
MouseListener interface which inherits EventListener along with 
mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), 
mouseDragged() methods. Also create KeyListener interface which 
inherits EventListener along with keyPressed(), keyReleased() 
methods. WAP to create EventDemo class which implements 
MouseListener and KeyListener and demonstrate all the methods of 
the interfaces. */


interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();

    void mousePressed();

    void mouseReleased();

    void mouseMoved();

    void mouseDragged();

}

interface KeyListener extends EventListener {
    void keyPressed();

    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener {
    void all() {
        performEvent();
        mouseClicked();
        mousePressed();
        mouseReleased();
        mouseMoved();
        mouseDragged();
        keyPressed();
        keyReleased();
    }

    public void performEvent() {
        System.out.println("Performing event");
    }

    public void mouseClicked() {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed() {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased() {
        System.out.println("Mouse Released");
    }

    public void mouseMoved() {
        System.out.println("Mouse Moved");
    }

    public void mouseDragged() {
        System.out.println("Mouse dragged");
    }

    public void keyPressed() {
        System.out.println("Key pressed");
    }

    public void keyReleased() {
        System.out.println("Key released");
    }
}

public class Event {
    public static void main(String[] args) {
        EventDemo demo = new EventDemo();
        demo.all();
    }
}
