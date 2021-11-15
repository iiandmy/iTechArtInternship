/*
	Determine, have two numbers common digit or not
*/

public class SharedDigit {
	public static boolean hasSharedDigit(int a, int b) {
		if (a < 10 || a > 99 || b < 10 || b > 99)
			return false;

		int[] aDigits = { a % 10, a / 10 % 10 };
		int[] bDigits = { b % 10, b / 10 % 10 };
		for (int aDigit : aDigits)
			for (int bDigit : bDigits)
				if (aDigit == bDigit)
					return true;

		return false;
	}
}
