public class Main {
	public static final int FEB = 2;
	public static void main(String[] args) {
		int[] years = { 1700, 1800, 1600, 1601, 4, 8, 1604, -4 };

		for (int y : years) 
			System.out.println(NumberOfDaysInMonth.calcNumber(y, FEB));
	}
}
