package strategy.example1;

public class DecoyDuck extends Duck{
    @Override
    public void display(){
        System.out.println("Decoy duck is rendered...");
    }

    @Override
    public void quack(){
        System.out.println("Squeak...Squeak...");
    }
}
