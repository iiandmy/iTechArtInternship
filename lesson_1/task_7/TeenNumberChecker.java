/*
    Teen number is number between 13 and 19 (inclusive).
    Find out if input array has teen numbers.
*/

public class TeenNumberChecker {
    public static boolean hasTeen(int[] ages) {
        for (int a : ages) {
            if (a >= 13 && a <= 19)
                return true;
        }
        return false;
    }
}
