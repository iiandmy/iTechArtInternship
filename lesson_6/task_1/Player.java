import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;
    
    private static final int NAME_ORD = 0;
    private static final int HP_ORD = 1;
    private static final int STRENGTH_ORD = 2;
    private static final int WEAPON_ORD = 3;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write(){
        List<String> list = new ArrayList<>();
        list.add(NAME_ORD, name);
        list.add(HP_ORD, String.valueOf(hitPoints));
        list.add(STRENGTH_ORD, String.valueOf(strength));
        list.add(WEAPON_ORD, weapon);
        return list;
    }

    @Override
    public void read(List<String> list){
        if (list == null || list.size() == 0)
            return;

        this.name = list.get(NAME_ORD);
        this.hitPoints = Integer.parseInt(list.get(HP_ORD));
        this.strength = Integer.parseInt(list.get(STRENGTH_ORD));
        this.weapon = list.get(WEAPON_ORD);
    }

    @Override
    public String toString(){
        return "Player{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + ", weapon='" + weapon + "'}";
    }
}
