package strategy.example4;

public class MuteSqueak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Eat Five Start Do-Nothing");
    }
}
