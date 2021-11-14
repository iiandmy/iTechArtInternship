public class Main {
    public static void main(String[] args) {
        final double[] numbers = {
            3.756,
            3.756999999999999,
            6.777,
            6.776
        };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    i
                    + " equals to "
                    + (i + 1)
                    + " : "
                    + DecimalComparator.equalsByThreeDecimalPlaces(numbers[i], numbers[++i])
            );
        }
    }
}
