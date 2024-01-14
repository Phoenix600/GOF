package strategy.kingsAndDungens;

public class BowAndArrowBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Shooting an arrow with bow");
    }
}
