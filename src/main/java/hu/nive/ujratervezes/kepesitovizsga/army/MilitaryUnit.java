package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int damage;
    protected boolean armor;

    public int getHitPoints() {
        return hitPoints;
    }

    protected abstract int doDamage();

    protected abstract void sufferDamage(int damage);
}
