package strategy.kingsAndDungens;

public class Troll extends  Character{
    public Troll() {
        this.setWeaponBehaviour(new BowAndArrowBehaviour());
    }

    @Override
    public void fight() {
        System.out.println("Troll is fighting...");
        this.getWeaponBehaviour().useWeapon();
    }
}
