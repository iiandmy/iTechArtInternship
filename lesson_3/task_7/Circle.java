public class Circle {
	double radius;

	public Circle(double radius) { this.radius = radius < 0 ? 0 : radius; }

	public double getRadius() { return this.radius; }
	public double getArea() { return this.radius * this.radius * Math.PI; }

	public void setRadius(double radius) { this.radius = radius; }
}
