package prob2.ducks;

import prob2.behaviors.CannotFly;
import prob2.behaviors.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
