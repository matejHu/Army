import java.util.Arrays;

public class Goblin extends Soldier implements Attacker, BeNaked {
    private static int nextId = 1;
    private int id;
    public Goblin() {
        super("Goblin", 1);
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
    public void beNaked() {
        int nakedDamage = this.damage + 3;
        System.out.println(this + " is getting naked and deals " + nakedDamage + " (" + this.damage + "+3) dmg");
    }

    @Override
    public String toString() {
        return super.name + " " + this.id;
    }
}