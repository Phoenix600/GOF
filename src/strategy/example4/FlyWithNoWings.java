package strategy.example4;

public class FlyWithNoWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Duck is flying with Jet-Packs");
    }
}
