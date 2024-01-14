package strategy.example4;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Duck can not fly");
    }
}
