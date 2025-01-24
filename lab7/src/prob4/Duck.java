package prob4;

public abstract class Duck implements FlyBehavior, QuackBehavior {

    public void swim() {
        System.out.println("swimming \n");
    }

    public abstract void display();
}
