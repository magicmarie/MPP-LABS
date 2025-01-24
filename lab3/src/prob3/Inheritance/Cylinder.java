package prob3.Inheritance;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public Cylinder(double radius, double height) {
        this(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public double computeVolume() {
        return Math.PI * radius * radius * height;
    }
}
