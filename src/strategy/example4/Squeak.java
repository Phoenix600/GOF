package strategy.example4;

import strategy.example3.Quackable;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Making Squeak sound....");
    }
}
