package prob3.Inheritance;

public class Circle extends Cylinder {
    public Circle(double radius) {
        super(radius);}

    public double computeArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
