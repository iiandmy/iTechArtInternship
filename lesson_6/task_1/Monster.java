import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable{
    private String name;
    private int hitPoints;
    private int strength;

    private static final int NAME_ORD = 0;
    private static final int HP_ORD = 0;
    private static final int STRENGTH_ORD = 0;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public List<String> write(){
        List<String> fields = new ArrayList<>();
        fields.add(NAME_ORD, name);
        fields.add(HP_ORD, String.valueOf(hitPoints));
        fields.add(STRENGTH_ORD, String.valueOf(strength));
        return fields;
    }

    @Override
    public void read(List<String> list){
        if (list == null || list.size() == 0)
            return;

        this.name = list.get(NAME_ORD);
        this.hitPoints = Integer.parseInt(list.get(HP_ORD));
        this.strength = Integer.parseInt(list.get(STRENGTH_ORD));
    }

    @Override
    public String toString(){
        return "Monster{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + "}";
    }
}
