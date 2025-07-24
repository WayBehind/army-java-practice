public abstract class Soldier implements Abilities {
    protected String name;
    protected int hitPoints;
    protected int damageValue;
    protected Stance stance;

    protected enum Move {
        ATTACK,
        DEFFEND,
        SPECIAL
    }

    public Soldier(String name, int hitPoints, int damageValue, Stance stance) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damageValue = damageValue;
        this.stance = stance;
    }

    public void setStance(Stance stance) {
        this.stance = stance;
    }

    @Override
    public String toString() {
        return "Soldier " + this.getClass() + " named " + name +
                ", Hit Points: " + hitPoints +
                ", Damage Value: " + damageValue +
                ", " + stance.getDescription() + " ";
    }
}
