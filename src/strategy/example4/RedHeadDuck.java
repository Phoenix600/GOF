package strategy.example4;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        this.setFlyBehaviour(new FlyWithWings());
        this.setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm the RedHead Duck ....");
    }
}
