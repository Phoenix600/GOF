package strategy.example4;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        this.setFlyBehaviour(new FlyNoWay());
        this.setQuackBehaviour(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm Decoy Duck");
    }
}
