public class GreatestCommonDivisor {
	public static int getGCD(int a, int b) {
		if (a < 10 || b < 10)
			return -1;

		while (a != 0 && b != 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}

		return a + b;
	}
}
