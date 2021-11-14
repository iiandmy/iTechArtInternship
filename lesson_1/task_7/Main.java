public class Main {
    public static void main(String[] args) {
        int[] hasTeens = { 12, 19, 21, 11, 14, 100 };
        int[] hasNoTeens = { 100, 100, 11, 12, 111 };

        System.out.println(
                TeenNumberChecker.hasTeen(hasTeens)
                + "\n"
                + TeenNumberChecker.hasTeen(hasNoTeens)
        );
    }
}
