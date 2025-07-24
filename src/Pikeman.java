public class Pikeman extends Soldier {
    public Pikeman(String name, int hitPoints, int damageValue, Stance stance) {
        super(name, hitPoints, damageValue, stance);
    }

    @Override
    public void attack() {
        System.out.println(this + "marches forward to " + Move.ATTACK);
    }

    @Override
    public void defend() {
        System.out.println(this + "raises their pike to " + Move.DEFFEND);
    }

    @Override
    public void special() {
        System.out.println(this + "taunts the enemy as a " + Move.SPECIAL + " move");
    }
}
