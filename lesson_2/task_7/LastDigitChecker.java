/*
	Return true if at least two numbers in array have two common last digits
in	: 123, 124, 126, 127, 129, 213
	    ^			     ^
out	: true
*/

public class LastDigitChecker {
	public static boolean hasSameLastDigit(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 10 || numbers[i] > 1000)
				return false;

			numbers[i] %= 10;
		}

		for (int i = 0; i < numbers.length; i++)
			for (int j = i + 1; j < numbers.length; j++)
				if (numbers[i] == numbers[j])
					return true;

		return false;
	} 
}
