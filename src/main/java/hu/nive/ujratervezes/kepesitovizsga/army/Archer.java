package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        super(50, 20, false);
    }

    @Override
    protected int doDamage() {
        return super.damage;
    }

    @Override
    protected void sufferDamage(int damage) {
        super.hitPoints -= (armor) ? damage / 2 : damage;
    }
}
