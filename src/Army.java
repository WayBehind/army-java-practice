import java.util.List;

public class Army {
    final private List<Soldier> army;

    public Army(List<Soldier> army) {
        this.army = army;
    }

    public void commandAttack(Stance stance) {
        System.out.println("----ATTACK----");
        for (Soldier soldier : this.army) {
            if (stance.equals(soldier.stance)) {
                soldier.attack();
            }
        }
        System.out.println("--------------");
    }

    public void commandDefend(Stance stance) {
        System.out.println("----DEFFEND----");
        for (Soldier soldier : this.army) {
            if (stance.equals(soldier.stance)) {
                soldier.defend();
            }
        }
        System.out.println("---------------");

    }

    public void commandSpecial(Stance stance) {
        System.out.println("----SPECIAL----");
        for (Soldier soldier : this.army) {
            if (stance.equals(soldier.stance)) {
                soldier.special();
            }
        }
        System.out.println("---------------");

    }

    public void commandReport() {
        System.out.println("----REPORT----");
        for (Soldier soldier : this.army) {
            System.out.println(soldier.toString());
        }
        System.out.println("--------------");
    }


}
