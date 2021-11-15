public class LargestPrime {
	public static int get(int number) {
		if (number <= 0)
			return -1;

		int largestPrime = -1;
		for (int i = 1; i <= number; i++)
			if (number % i == 0)
				if (isPrime(i))
					largestPrime = i;

		return largestPrime;
	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;

		for (int i = 2; i < number; i++)
			if (number % i == 0) return false;

		return true;
	}
}
