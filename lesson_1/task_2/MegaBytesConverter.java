/*
    Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
    The method should not return anything (void) and it needs to calculate the megaBytes and remaining kiloBytes from the kiloBytes parameter.
    Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
*/

public class MegaBytesConverter {
    public static final int KILOBYTES_IN_MEGABYTES = 1024;

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = kiloBytes / KILOBYTES_IN_MEGABYTES;
        int remainKiloBytes = kiloBytes - megaBytes * KILOBYTES_IN_MEGABYTES;
        System.out.printf("%d KB = %d MB and %d KB\n", kiloBytes, megaBytes, remainKiloBytes);
    }
}
