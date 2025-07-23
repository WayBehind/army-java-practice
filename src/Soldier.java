public abstract class Soldier implements Abilities {
    protected String name;
    protected int hitPoints;
    protected int damageValue;
    protected Stance stance;

    public Soldier(String name, int hitPoints, int damageValue, Stance stance) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damageValue = damageValue;
        this.stance = stance;
    }

    @Override
    public void attack() {
        System.out.println(this + "attacks");
    }

    @Override
    public void defend() {

    }

    @Override
    public void special() {

    }
}
