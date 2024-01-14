package strategy.example4;

public class MallardDuck extends Duck{
    public MallardDuck() {
        this.setQuackBehaviour(new Quack());
        this.setFlyBehaviour(new FlyWithWings());
    }
    @Override
    public void display(){
        System.out.println("I'm a real Mallard Duck");
    }
}
