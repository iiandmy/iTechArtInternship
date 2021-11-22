package task_3;

/*
    Create an abstract class Heavenly Body
    And make it possible to create 3 types of it.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HeavenlyBody> bodies = new ArrayList<>(){{
            add(new Planet("Earth", 365));
            add(new Planet("Mars", 687));
            add(new DwarfPlanet("Pluto", 248 * 365));
        }};
        bodies.get(0).addSatellite(new Moon("Moon", 27));
        bodies.get(1).addSatellite(new Moon("Phobos", 0.3));
        bodies.get(2).addSatellite(new Moon("Charon", 6.375));
        for (HeavenlyBody planet : bodies)
            System.out.println(planet.toString());
    }
}
