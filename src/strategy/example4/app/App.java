package strategy.example4.app;

import strategy.example4.DecoyDuck;
import strategy.example4.Duck;

public class App {
    public static void main(String[] args) {

        Duck duck = new DecoyDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();
        duck.swim();

    }
}
