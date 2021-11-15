public class NumberToWords {
	public static String convert(int number) {
		if (number < 0)
			return null;
		number = reverseNumber(number);
		StringBuilder result = new StringBuilder();

		while (number >= 1) {
			result.append(numberToString(number % 10) + " ");
			number /= 10;
		}

		return result.append("\n").toString();
	}

	private static int reverseNumber(int number) {
		if (number < 0 || number < 10)
			return number;

		char[] numberDigits = Integer.toString(number).toCharArray();
		StringBuilder result = new StringBuilder();

		for (int i = numberDigits.length - 1; i >= 0; i--) {
			result.append(numberDigits[i]);
		}

		return Integer.parseInt(result.toString());
	}

	private static String numberToString(int number) {
		switch (number) {
			case 0: return "ZERO";
			case 1: return "ONE";
			case 2: return "TWO";
			case 3: return "THREE";
			case 4: return "FOUR";
			case 5: return "FIVE";
			case 6: return "SIX";
			case 7: return "SEVEN";
			case 8: return "EIGHT";
			case 9: return "NINE";
			default: return "OTHER";
		}
	}
}
