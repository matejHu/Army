package Soldiers;

import Abilities.Attacker;
import Abilities.Defender;
import Abilities.GodCaller;
import Soldiers.Soldier;

import java.util.Arrays;
import java.util.Random;

public class Templar extends Soldier implements Attacker, Defender, GodCaller {
    private static int nextId = 1;
    private final int id;

    public Templar() {
        super("Templar", 6);
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
    public void defend() {
        System.out.println(this + " deals " + this.damage + " dmg");
    }

    @Override
    public void callGod() {
        Random chance = new Random();
        int number = chance.nextInt(50);
        double godDamage = this.damage * number;
        System.out.println("SUPERIOR " + this.name + " " + this.id + " calls GOD and deals " + godDamage + " random godDmg");
    }

    @Override
    public String toString() {
        return super.name + " " + this.id;
    }
}
