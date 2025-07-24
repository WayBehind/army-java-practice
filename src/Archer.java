public class Archer extends Soldier {
    public Archer(String name, int hitPoints, int damageValue, Stance stance) {
        super(name, hitPoints, damageValue, stance);
    }

    @Override
    public void attack() {
        System.out.println(this + "shoots an arrow to " + Move.ATTACK);
    }

    @Override
    public void defend() {
        System.out.println(this + "seeks cover to " + Move.DEFFEND);
    }

    @Override
    public void special() {
        System.out.println(this + "uses a catapult to shoot a cow as a " + Move.SPECIAL + " move");

    }

}
