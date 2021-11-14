public class EvenDigits {
	public static int calcSum(int number) {
		if (number < 0)
			return -1;

		// Jump to the last even digit if number of digits is odd
		if (Integer.toString(number).length() % 2 != 0)
			number /= 10;

		int resultSum = 0;
		final int step = 100;

		while (number > 0) {
			resultSum += number % 10;
			number /= step;
		}

		return resultSum;
	}
}
