/*
	Find sum of first and last digit of number
in  : 1234
      ^  ^
out : 1 + 4 = 5
*/

public class FirstAndLastDigitSum {
	public static int calcSum(int number) {
		if (number < 0) 
			return -1;

		int digit = 10;
		if (number < 10)
			return number;

		while (number / digit > 10)
			digit *= 10;

		int firstDigit = number / digit;
		int lastDigit = number % 10;

		return firstDigit + lastDigit;
	}
}
