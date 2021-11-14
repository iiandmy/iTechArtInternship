/*
    Output minutes in format "XX minutes = YY years ZZ days"
*/

public class MinutesToYearsAndDaysCalculator {
    private static final int MINUTES_IN_YEAR = 525600;
    private static final int MINUTES_IN_DAY = 1440;

    public static void formatOutput(int minutes) {
        int years = minutes / MINUTES_IN_YEAR;
        int days = minutes % MINUTES_IN_YEAR / MINUTES_IN_DAY;
        System.out.printf("%d minutes = %d years and %d days.", minutes, years, days);
    }
}
