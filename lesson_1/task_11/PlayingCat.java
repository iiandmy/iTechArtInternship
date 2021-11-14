/*
    Cat spending his day playing most of the time.
    His preferred temperature range is between 25 and 35 Celsius.
    But when its summer outside, upper threshold increases by 10.
    Determine, is cat playing today or not.
*/

public class PlayingCat {
    public static final int T_LOWER_THRESHOLD = 25;
    public static final int T_UPPER_THRESHOLD = 35;

    public static boolean isPlaying(boolean isSummer, int temperature) {
        return (temperature >= T_LOWER_THRESHOLD && temperature <= T_UPPER_THRESHOLD + (isSummer ? 10 : 0));
    }
}
