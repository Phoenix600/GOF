package strategy.kingsAndDungens;

public class Knight extends Character{
    public Knight() {
        this.setWeaponBehaviour(new AxeBehaviour());
    }

    @Override
    public void fight() {
        System.out.println("Knight is fighting");
        this.getWeaponBehaviour().useWeapon();
    }
}
