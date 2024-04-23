package Soldiers;

import Abilities.Attacker;
import Abilities.BeNaked;
import Soldiers.Soldier;

import java.util.Arrays;

public class NakedWarrior extends Soldier implements Attacker, BeNaked {
    private static int nextId = 1;
    private final int id;

    public NakedWarrior() {
        super("NakedWarrior", 2);
        this.id = nextId++;
    }

    @Override
    public void report() {
        String array = Arrays.toString(this.getClass().getInterfaces());
        System.out.println(this + " HERE " + array.replace("interface ", "").replace("Abilities.",""));
    }

    @Override
    public void attack() {
        System.out.println(this + " deals " + this.damage + " dmg");
    }

    @Override
    public void beNaked() {
        int nakedDamage = this.damage + 3;
        System.out.println(this + " is already naked, but when sees Spearwoman getting naked deals " + nakedDamage + " (" + this.damage + "+3) dmg");
    }


    @Override
    public String toString() {
        return super.name + " " + this.id;
    }

}
