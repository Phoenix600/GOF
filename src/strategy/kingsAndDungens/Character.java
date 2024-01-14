package strategy.kingsAndDungens;

public abstract  class Character {

    private WeaponBehaviour weaponBehaviour;

    public abstract void fight();

    public WeaponBehaviour getWeaponBehaviour() {
        return weaponBehaviour;
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
