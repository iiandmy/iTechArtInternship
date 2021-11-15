import java.util.ArrayList;
import java.util.List;

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

		Integer[] factors = findFactors(number);
		int factorsSum = 0;
		for (Integer f : factors) {
			factorsSum += f;
		}

		if (factorsSum == number)
			return true;

		return false;
	}

	private static Integer[] findFactors(int number) {
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
