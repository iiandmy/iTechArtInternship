package task_2;

import java.util.Map;

public final class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> directions;

    public Location(int locationID, String description, Map<String, Integer> directions) {
        this.locationID = locationID;
        this.description = description;
        this.directions = directions;
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getDirections() { return directions; }
}