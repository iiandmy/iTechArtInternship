package task_3;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    enum BodyType {
        PLANET,
        DWARF_PLANET,
        MOON
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.key = new Key(name, bodyType);
    }

    public double getOrbitalPeriod() { return orbitalPeriod; }

    public Key getKey() { return key; }

    public Set<HeavenlyBody> getSatellites() { return satellites; }

    public final boolean equals(HeavenlyBody hb) {
        return getKey().equals(hb.getKey());
    }

    public final int hashCode() {
        return getKey().hashCode();
    }

    public static Key makeKey(String name, BodyType bt) {
        return new Key(name, bt);
    }

    public String toString() {
        return getKey().toString() + " " + getOrbitalPeriod();
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        return satellites.add(satellite);
    }

    public static final class Key {
        private final String name;
        private final BodyType bodyType;

        private Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() { return name; }

        public BodyType getBodyType() { return bodyType; }

        public boolean equals(Key keyToCompare) {
            return checkNameEquality(getName(), keyToCompare.getName()) && checkBodyTypeEquality(getBodyType(), keyToCompare.getBodyType());
        }

        private boolean checkNameEquality(String name1, String name2) { return name1.equals(name2); }
        private boolean checkBodyTypeEquality(BodyType bt1, BodyType bt2) { return bt1.equals(bt2); }

        public int hashCode() {
            return (int) (getName().hashCode() + getBodyType().hashCode() + Math.random());
        }

        public String toString() {
            return getName() + ": " + getBodyType().toString();
        }
    }
}
