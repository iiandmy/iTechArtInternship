package task_1;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> directions;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.directions = new HashMap<>();
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public void addDirection(String direction, int locationID) {
        directions.put(direction, locationID);
    }

    public Map<String, Integer> getDirections() { return directions; }
}