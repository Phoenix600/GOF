package strategy.example3;

import strategy.example3.Flyable;
import strategy.example3.Quackable;

public class MallardDuck extends Duck implements Flyable,Quackable{
    @Override
    public void fly() {
        System.out.println("MallardDuck is flying...");
    }

    @Override
    public void quack() {
        System.out.println("Quack...Quack...");
    }
}
