/*Create a class named ThreeDPoint to model a point in a three dimensional space. Let ThreeDPoint be derived from MyPoint with 
following additional features:
a. A data fields named z that represents the z-coordinate.
b. A no-arg constructor that creates a point (0, 0, 0).
c. A constructor that constructs a point with three specified 
coordinates.
d. A get method that returns the z value.
e. Override the distance method to return the distance between 
two points in the three-dimensional space.
f. Write a program that creates two points (0, 0, 0) and (10, 
30, 25.5) and display the distance between the two points. */

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

class ThreeDPoint extends MyPoint {
    double z;

    public ThreeDPoint() {
        super();
        this.z = 0;
    }

    public ThreeDPoint(double a, double b, double c) {
        super(a, b);
        this.z = c;
    }

    double get() {
        return (this.z);

    }

    double distance(ThreeDPoint a) {
        double ansX2 = a.x - this.x;
        double ansY2 = a.y - this.y;
        double ansZ2 = a.z - this.z;
        return Math.sqrt(ansX2 * ansX2 + ansY2 * ansY2 + ansZ2 * ansZ2);
    }

}

public class Geometry3D extends MyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(2, 3);
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
        System.out.println("Distance between point1 and (6, 8): " + point1.distance(6, 8));
        ThreeDPoint point3 = new ThreeDPoint();
        ThreeDPoint point4 = new ThreeDPoint(10, 30, 25.5);
        System.out.println("Value of z is:" + point4.get());
        System.out.println("Distance is: " + point3.distance(point4));

    }

}
