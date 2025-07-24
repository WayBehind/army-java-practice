public class Cavalry extends Soldier {
    public Cavalry(String name, int hitPoints, int damageValue, Stance stance) {
        super(name, hitPoints, damageValue, stance);
    }

    @Override
    public void attack() {
        System.out.println(this + "charges forward to " + Move.ATTACK);
    }

    @Override
    public void defend() {
        System.out.println(this + "hurries to safety to " + Move.DEFFEND);
    }

    @Override
    public void special() {
        System.out.println(this + "flanks the enemy as a " + Move.SPECIAL + " move");

    }

}
