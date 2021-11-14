public class Main {
    public static void main(String[] args) {
        int[] summerTemperatures = { 35, 25, 24, 45 };
        int[] notSummerTemperatures = {  25, 24, 35, 36};

        for (int t : summerTemperatures)
            System.out.print(PlayingCat.isPlaying(true, t) + " ");

        System.out.println();

        for (int t : notSummerTemperatures)
            System.out.print(PlayingCat.isPlaying(false, t) + " ");
    }
}
