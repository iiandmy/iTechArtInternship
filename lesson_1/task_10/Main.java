public class Main {
    public static void main(String[] args) {
        int[] allEquals = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] notAllEquals = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };

        System.out.println(
                EqualsNumberChecker.equals(allEquals)
                + "\n"
                + EqualsNumberChecker.equals(notAllEquals)
        );
    }
}
