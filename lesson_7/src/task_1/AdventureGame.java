package task_1;

import java.util.ArrayList;

public class AdventureGame {
    private Location currentLocation;
    private final ArrayList<Location> locations;

    public AdventureGame(Location startLocation, ArrayList<Location> locations) {
        this.currentLocation = startLocation;
        this.locations = locations;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    @SuppressWarnings("SimplifiableConditionalExpression")
    public boolean move(String direction) {
        return checkLegitMove(direction) ? changeCurrentLocation(getLocationID(direction)) : false;
    }

    private boolean checkLegitMove(String direction) {
        return getCurrentLocation().getDirections().containsKey(direction);
    }

    private int getLocationID(String direction) {
        return getCurrentLocation().getDirections().get(direction);
    }

    private boolean changeCurrentLocation(int locationID) {
        setCurrentLocation(getLocations().stream().filter(location -> location.getLocationID() == locationID).findFirst().get());
        return true;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void printCurrentStep() {
        printDescription();
        printAvailableDirections();
    }

    private void printDescription() {
        System.out.println(getCurrentLocation().getDescription());
    }

    private void printAvailableDirections() {
        System.out.println("Available directions: " + getCurrentLocation().getDirections().toString());
    }
}
