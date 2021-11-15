/*
	Calculate days count in month, according year is leap or not
*/

public class NumberOfDaysInMonth {
	private final static int FEB = 1;
	public static int calcNumber(int year, int month) {
		if (year < 1 || year > 9999 || month < 1 || month > 12)
			return -1;
		
		int[] numberOfDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeap(year))
			numberOfDays[FEB]++;

		return numberOfDays[--month];
	}

	private static boolean isLeap(int year) {
		if (year < 1 || year > 9999)
			return false;

		if (year % 4 != 0)
			return false;

		return (year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);
	}
}
