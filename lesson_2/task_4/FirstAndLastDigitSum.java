public class FirstAndLastDigitSum {
	public static int calcSum(int number) {
		if (number < 0) 
			return -1;

		int digit = 10;
		if (number < 10)
			return number;

		while (number / digit > 10)
			digit *= 10;

		// 100000000
		// 12.3456789
		int firstDigit = number / digit;
		int lastDigit = number % 10;

		return firstDigit + lastDigit;
	}
}
