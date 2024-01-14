package strategy.example2;

public class MallardDuck extends Duck implements Flyable,Quackable{
    @Override
    public void fly() {
        System.out.println("Mallard Duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack...Quack...");
    }
}
