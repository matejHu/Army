import java.util.Arrays;
import java.util.Random;
public class Horseman extends Soldier implements Attacker, Defender, GodCaller{
    private static int nextId = 1;
    private int id;

    public Horseman() {
        super("Horseman", 5);
        this.id = nextId++;
    }

    @Override
    public void report() {
        String array = Arrays.toString(this.getClass().getInterfaces());
        System.out.println(this + " HERE " + array.replace("interface ", ""));
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
