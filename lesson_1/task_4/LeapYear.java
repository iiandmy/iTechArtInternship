/*
    Define if year is leap.
    Leap year must divide by 4 without remainder.
    If year aliquot both 4 and 100 it must divide by 400 without remainder.
    Valid years are between 1 and 9999.
*/

public class LeapYear {
    public static boolean isLeap(int year) {
        if (year < 1 || year > 9999)
            return false;

        if (year % 4 != 0)
            return false;

        // This step we know that it is valid year aliquot 4.
        return (year % 100 != 0) || ((year % 100 == 0) && (year % 400 == 0));
    }
}
