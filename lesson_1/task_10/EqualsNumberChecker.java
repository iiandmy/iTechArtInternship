/*
    Check if all numbers in input data are equals to each other.
*/

public class EqualsNumberChecker {
    public static boolean equals(int[] numbers) {
        if (numbers.length == 0)
            return false;

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] != numbers[i - 1])
                return false;

        return true;
    }
}
