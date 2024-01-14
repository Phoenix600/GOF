package strategy.example2;

public class DecoyDuck extends Duck implements  Quackable{

    @Override
    public void quack() {
        System.out.println("Squeak...Squeak...");
    }
}
