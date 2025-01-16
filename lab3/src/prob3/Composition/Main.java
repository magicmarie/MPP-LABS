package prob3.Composition;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        Cylinder cylinder = new Cylinder(10, 34);

        System.out.println("circle area: " + circle.computeArea());
        System.out.println("cylinder volume: " + cylinder.computeVolume());
    }
}