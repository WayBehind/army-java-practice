import java.util.List;

public class Main {
    public static void main(String[] args) {

        Army army1 = new Army(List.of(
                new Pikeman("John", 2, 3, Stance.DEFENSIVE),
                new Pikeman("Carl", 2, 3, Stance.DEFENSIVE),
                new Pikeman("Peter", 2, 3, Stance.DEFENSIVE),

                new Archer("Adam", 1, 4, Stance.CAUTIOUS),
                new Archer("Eve", 1, 4, Stance.CAUTIOUS),

                new Cavalry("Sir Roger the Blind", 9, 6, Stance.OFFENSIVE),
                new Cavalry("Kevin", 3, 2, Stance.OFFENSIVE))
        );

        army1.commandReport();
        army1.commandAttack(Stance.OFFENSIVE);
        army1.commandAttack(Stance.CAUTIOUS);
        army1.commandDefend(Stance.DEFENSIVE);
        army1.commandSpecial(Stance.OFFENSIVE);
        army1.commandSpecial(Stance.CAUTIOUS);
        army1.commandSpecial(Stance.DEFENSIVE);

    }
}