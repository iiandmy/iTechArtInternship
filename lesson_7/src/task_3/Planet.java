package task_3;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody hb) {
        return hb.getKey().getBodyType().equals(BodyType.MOON) ? super.addSatellite(hb) : false;
    }
}
