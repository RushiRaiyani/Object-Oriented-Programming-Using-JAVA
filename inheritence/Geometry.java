/* Design a class named MyPoint to represent a point with x and y-coordinates. The class contains:
a. The data fields x and y that represent the coordinates with 
getter methods.
b. A no-arg constructor that creates a point (0, 0).
c. A constructor that constructs a point with specified 
coordinates.
d. A method named distance that returns the distance from this 
point to a specified point of the MyPoint type.
e. A method named distance that returns the distance from this 
point to another point with specified x- and y-coordinates. */

package inheritence;

class MyPoint {
    double x;
    double y;

    MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    MyPoint(double a, double b) {
        this.x = a;
        this.y = b;
    }

    double distance(MyPoint give) {
        double ansX1 = give.x - this.x;
        double ansY1 = give.y - this.y;
        return Math.sqrt(ansX1 * ansX1 + ansY1 * ansY1);
    }

    double distance(int a, int b) {
        double ansX1 = a - this.x;
        double ansY1 = b - this.y;
        return Math.sqrt(ansX1 * ansX1 + ansY1 * ansY1);
    }

}

public class Geometry {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(2, 3);
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
        System.out.println("Distance between point1 and (6, 8): " + point1.distance(6, 8));
    }
}
