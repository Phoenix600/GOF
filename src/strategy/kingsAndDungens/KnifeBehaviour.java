package strategy.kingsAndDungens;

public class KnifeBehaviour implements  WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Cutting with knife...");
    }
}
