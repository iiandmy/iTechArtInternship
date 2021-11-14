public class Main {
    public static void main(String[] args) {
        int a = 12, b = 13, c = a + b;
        System.out.println(
                EqualSumChecker.equals(12, 13, c)
                + "\n"
                + EqualSumChecker.equals(12, 13, c - 1)
        );
    }
}
