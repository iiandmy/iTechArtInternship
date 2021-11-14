public class NumberPalindrome {
	public static boolean isPalindrome(int number) {
		char[] numberStr = Integer.toString(number).toCharArray();
		int startIndex = 0, endIndex = numberStr.length - 1;
		do {
			if (numberStr[startIndex] != numberStr[endIndex])
				return false;
			startIndex++;
			endIndex--;
		} while (startIndex != numberStr.length / 2);

		return true;
	}
}
