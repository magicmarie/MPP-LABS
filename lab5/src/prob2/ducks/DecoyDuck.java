package prob2.ducks;

import prob2.behaviors.CannotFly;
import prob2.behaviors.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }
}