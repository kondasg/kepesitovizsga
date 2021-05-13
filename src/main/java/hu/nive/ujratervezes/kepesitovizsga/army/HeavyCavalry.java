package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int countDoDamage;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    protected int doDamage() {
        countDoDamage++;
        return (countDoDamage == 1) ? super.damage * 3 : super.damage;
    }

    @Override
    protected void sufferDamage(int damage) {
        super.hitPoints -= (armor) ? damage / 2 : damage;
    }
}
