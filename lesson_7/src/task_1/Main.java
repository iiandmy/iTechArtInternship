package task_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Location> locations = initLocations();
        addDirections(locations);
        AdventureGame game = new AdventureGame(locations.get(4), locations);
        runGame(game);
    }

    private static void runGame(AdventureGame game) {

        Scanner in = new Scanner(System.in);

        while (true) {
            game.printCurrentStep();
            String command = in.nextLine();
            if (command.equals("Q"))
                break;

            command = encryptCommand(command);
            game.move(command);
        }
        in.close();
    }

    private static String encryptCommand(String command) {
        for (String s : command.toUpperCase().split(" ")) {
            if (s.matches("E(AST)?"))
                return "E";
            else if (s.matches("W(EST)?"))
                return "W";
            else if (s.matches("N(ORTH)?"))
                return "N";
            else if (s.matches("S(OUTH)?"))
                return "S";
        }
        return "ERROR";
    }

    private static ArrayList<Location> initLocations() {
        return new ArrayList<>(){{
            add(new Location(1, "Сhilling horror creeps across the skin here."));
            add(new Location(2, "A big brick building in the middle of this place."));
            add(new Location(3, "Nothing but big high trees here."));
            add(new Location(4, "You heard some happy noises, but have no idea where."));
            add(new Location(5, "You have a strange feeling that you in the middle of nowhere."));
            add(new Location(6, "It's a meadow. Nothing but flowers here."));
            add(new Location(7, "Suspicious barn, you have no desire to go inside."));
            add(new Location(8, "Big human height mushrooms here."));
            add(new Location(9, "No crisps in this place."));
        }};
    }

    private static void addDirections(ArrayList<Location> locations) {
        locations.get(0).addDirection("W", 2);
        locations.get(0).addDirection("S", 4);
        locations.get(1).addDirection("E", 1);
        locations.get(1).addDirection("W", 3);
        locations.get(1).addDirection("S", 5);
        locations.get(2).addDirection("E", 2);
        locations.get(2).addDirection("S", 6);
        locations.get(3).addDirection("N", 1);
        locations.get(3).addDirection("W", 5);
        locations.get(3).addDirection("S", 7);
        locations.get(4).addDirection("N", 2);
        locations.get(4).addDirection("S", 8);
        locations.get(4).addDirection("E", 4);
        locations.get(4).addDirection("W", 6);
        locations.get(5).addDirection("N", 3);
        locations.get(5).addDirection("S", 9);
        locations.get(5).addDirection("E", 5);
        locations.get(6).addDirection("N", 4);
        locations.get(6).addDirection("W", 8);
        locations.get(7).addDirection("E", 7);
        locations.get(7).addDirection("W", 9);
        locations.get(7).addDirection("N", 5);
        locations.get(8).addDirection("N", 6);
        locations.get(8).addDirection("E", 8);
    }
}
