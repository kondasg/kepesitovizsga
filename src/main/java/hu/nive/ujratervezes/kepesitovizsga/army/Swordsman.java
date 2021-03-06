package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean shield;
    private int stroke;

    public Swordsman(boolean armor) {
        super(100, 10, armor);
        shield = true;
    }

    @Override
    protected int doDamage() {
        return super.damage;
    }

    @Override
    protected void sufferDamage(int damage) {
        if (!shield) super.hitPoints -= (armor) ? damage / 2 : damage;
        stroke++;
        if (stroke == 1) {
            shield = false;
        }
    }
}
