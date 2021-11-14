public class Main {
    public static void main(String[] args) {
        final double radius = 1 / Math.sqrt(Math.PI);
        final double x = 10d, y = 30d;
        System.out.println(
                "Circle example: " + AreaCalculator.calculateArea(radius)
                + "\n"
                + "Rectangle example: " + AreaCalculator.calculateArea(x, y)
        );
    }
}
