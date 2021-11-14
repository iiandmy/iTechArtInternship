import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
	public static boolean isPerfect(int number) {
		if (number < 1)
			return false;

		Integer[] divisors = findDivisors(number);
		int divisorsSum = 0;
		for (Integer d : divisors) {
			divisorsSum += d;
		}

		if (divisorsSum == number)
			return true;

		return false;
	}

	private static Integer[] findDivisors(int number) {
		if (number < 0)
			return null;

		List<Integer> divisors = new ArrayList<>();
		for (int i = 1; i < number; i++) 
			if (number % i == 0)
				divisors.add(i);

		Integer[] result = new Integer[divisors.size()];
		result = divisors.toArray(result);

		return result;
	}
}
