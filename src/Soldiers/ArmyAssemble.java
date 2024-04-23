import Abilities.*;
import Soldiers.*;

import java.util.ArrayList;
import java.util.List;

public class ArmyAssemble {

    List<Soldier> soldiers = new ArrayList<>();

    public ArmyAssemble() {

        Goblin g1 = new Goblin();
        soldiers.add(g1);
        Goblin g2 = new Goblin();
        soldiers.add(g2);
        NakedWarrior n1 = new NakedWarrior();
        soldiers.add(n1);
        NakedWarrior n2 = new NakedWarrior();
        soldiers.add(n2);
        SpearWoman spw1 = new SpearWoman();
        soldiers.add(spw1);
        SpearWoman spw2 = new SpearWoman();
        soldiers.add(spw2);
        Spearman sp1 = new Spearman();
        soldiers.add(sp1);
        Spearman sp2 = new Spearman();
        soldiers.add(sp2);
        Horseman h1 = new Horseman();
        soldiers.add(h1);
        Horseman h2 = new Horseman();
        soldiers.add(h2);
        Templar t1 = new Templar();
        soldiers.add(t1);
        Templar t2 = new Templar();
        soldiers.add(t2);

    }

    public void armyReport() {
        System.out.println();
        System.out.println();
        System.out.println("-----------Report----------");
        for (Soldier soldier : soldiers) {

            soldier.report();
        }
    }

    public void armyGetNaked() {
        System.out.println();
        System.out.println();
        System.out.println("-----------GETTING NAKED----------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof BeNaked) {
                ((BeNaked) soldier).beNaked();
            }
        }
    }

    public void armyAttack() {
        System.out.println();
        System.out.println();
        System.out.println("-----------ATTACK----------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Attacker) {
                ((Attacker) soldier).attack();
            }
        }
    }

    public void godCall() {
        System.out.println();
        System.out.println();
        System.out.println("-----------GOD CALLING----------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof GodCaller) {
                ((GodCaller) soldier).callGod();
            }
        }
    }

    public void armyRanged() {
        System.out.println();
        System.out.println();
        System.out.println("-----------RANGE ATTACK----------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof CanThrow) {
                ((CanThrow) soldier).canThrow();
            }
        }
    }

    public void armyDefend() {
        System.out.println();
        System.out.println();
        System.out.println("-----------DEFENDING----------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Defender) {
                ((Defender) soldier).defend();
            }
        }
    }
}



