package Soldiers;

import Abilities.BeNaked;
import Abilities.CanThrow;
import Abilities.Defender;
import Soldiers.Soldier;

import java.util.Arrays;
import java.util.Random;

public class SpearWoman extends Soldier implements Defender, CanThrow, BeNaked {
    private static int nextId = 1;
    private final int id;

    public SpearWoman() {
        super("SpearWoman", 3);
        this.id = nextId++;
    }

    @Override
    public void report() {
        String array = Arrays.toString(this.getClass().getInterfaces());
        System.out.println(this + " HERE " + array.replace("interface ", "").replace("Abilities.",""));
    }

    @Override
    public void defend() {
        System.out.println(this.name + " " + this.id + " deals " + this.damage + " dmg");
    }

    @Override
    public void canThrow() {
        double throwDmg = this.damage * 1.5;
        Random chance = new Random();
        int number = chance.nextInt(10);
        if (number <= 5) {
            System.out.println(this + " CAN THROW and deals " + throwDmg + " throw dmg");
        } else {
            System.out.println(this + " MISSED");
        }
    }

    @Override
    public void beNaked() {
        int nakedDamage = this.damage + 3;
        System.out.println(this + " is getting naked and deals " + nakedDamage + " (" + this.damage + "+3) dmg");
    }

    @Override
    public String toString() {
        return super.name + " " + this.id;
    }
}
