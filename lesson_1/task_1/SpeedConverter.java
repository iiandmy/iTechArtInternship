/*
    Convert km/h in mil/h.
    Return -1 if passing negative km/h value.
*/

public class SpeedConverter {
    public static final double KILOMETERS_IN_MILES = 1.609;

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        return Math.round(kilometersPerHour / KILOMETERS_IN_MILES);
    }
}
