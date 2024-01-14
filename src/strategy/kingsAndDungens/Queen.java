package strategy.kingsAndDungens;

public class Queen extends Character{
    public Queen() {
        this.setWeaponBehaviour(new KnifeBehaviour());
    }

    @Override
    public void fight() {
        System.out.println("Queen is fighting...");
        this.getWeaponBehaviour().useWeapon();
    }
}
