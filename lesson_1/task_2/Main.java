public class Main {
    public static void main(String[] args) {
        final int[] kiloBytes = {
                1024, // 1 MB
                1025, // 1 MB and 1 KB
                2049  // 2 MB and 1 KB
        };
        for (int kb : kiloBytes)
            MegaBytesConverter.printMegaBytesAndKiloBytes(kb);
    }
}
