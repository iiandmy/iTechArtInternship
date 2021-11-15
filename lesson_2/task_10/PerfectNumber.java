/*
	Determine is input number perfect or not
	Perfect number - a number where sum of it's factors equals this number
in	: 6
	  6 -> 1 + 2 + 3 = 6
out	: true
*/

public class PerfectNumber {
	public static boolean isPerfect(int number) {
		if (number < 1)
			return false;

		int factorsSum = findFactorsSum(number);

		if (factorsSum == number)
			return true;

		return false;
	}

	private static int findFactorsSum(int number) {
		if (number < 0)
			return -1;

		int resultSum = 0;
		for (int i = 1; i < number; i++) 
			if (number % i == 0)
				resultSum += i;

		return resultSum;
	}
}
