/*
	Print all factors of int number (including itself)
in	: 6
	  6 -> 6 % 1 = 0; 6 % 2 = 0; 6 % 3 = 0
out	: 1 2 3 6
*/

public class AllFactors {
	public static void printFactors(int number) {
		if (number < 1) {
			System.out.println("Invalid Value!");
			return;
		}

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + "\n");
			}
		}
	}
}
