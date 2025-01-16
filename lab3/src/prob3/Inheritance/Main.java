package prob3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15.9);
        Cylinder cylinder = new Cylinder(12, 34);
        Cylinder circle2 = new Circle(12);

        System.out.println("circle area: " + circle.computeArea());
        System.out.println("cylinder volume: " + cylinder.computeVolume());
        System.out.println("circle2 area: " + circle2.computeVolume());

    }
}