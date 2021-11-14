public class Main {
    public static void main(String[] args) {
        final int[] years = {
            // Leap:
            8, 1600, 2020, 16,
            // Not Leap:
            1700, 1800, 2021, 3
        };
        for (int year : years)
            System.out.println(year + " : " + LeapYear.isLeap(year));
    }
}
