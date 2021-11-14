/*
    Calculate the area of circle with radius.
    Overload method with calculating rectangle area.
*/

public class AreaCalculator {
    public static double calculateArea(double radius) {
        if (radius < 0.0)
            return -1.0;

        return radius * radius * Math.PI;
    }

    public static double calculateArea(double x, double y) {
        if (x < 0.0 || y < 0.0)
            return -1.0;

        return x * y;
    }
}
