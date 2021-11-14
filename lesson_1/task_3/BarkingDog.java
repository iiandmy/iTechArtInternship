/*
    We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
    In all other cases return false.
*/

public class BarkingDog {
    private static final int NIGHT_START = 22;
    private static final int NIGHT_END = 8;

    public static boolean isWakeUp(boolean isBarking, int currentTime) {
        if (isBarking == false)
            return false;

        return currentTime <= 23 && currentTime >= 0 && (currentTime >= NIGHT_START || currentTime <= NIGHT_END);
    }
}
