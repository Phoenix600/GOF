package strategy.example3;

public class DecoyDuck extends Duck implements Quackable{
    @Override
    public void quack() {
        System.out.println("DecoyDuck is making squeak sound...");
    }
}
