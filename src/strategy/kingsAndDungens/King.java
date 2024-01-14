package strategy.kingsAndDungens;

public class King extends Character{
    public King() {
        this.setWeaponBehaviour(new SwordBehaviour());
    }

    @Override
    public void fight() {
        System.out.println("King is fighting");
        this.getWeaponBehaviour().useWeapon();
    }


}
