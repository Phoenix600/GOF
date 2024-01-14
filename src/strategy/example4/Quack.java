package strategy.example4;

public class Quack implements  QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Making Quack sound");
    }
}
