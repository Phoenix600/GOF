package strategy.example2;


public class RedHeadDuck extends Duck implements  Flyable, Quackable{
    @Override
    public void fly() {
        System.out.println("RedHead duck is flying...");
    }

    @Override
    public void quack() {
        System.out.println("Quack...Quack...");
    }
}
