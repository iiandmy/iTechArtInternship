/*
    Determine that two DOUBLE numbers are equals by three decimal places.
    F.E 3.754 will be equals to 3.7549999 but neither to 3.755.
*/

public class DecimalComparator {
    public static boolean equalsByThreeDecimalPlaces(double a, double b) {
        int aToCompare = (int) (a * 1000);
        int bToCompare = (int) (b * 1000);
        return aToCompare == bToCompare;
    }
}
