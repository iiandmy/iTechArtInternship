public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length < 0 ? 0 : length;
		this.width = width < 0 ? 0 : width;
	}

	public double getLength() { return this.length; }
	public double getWidth() { return this.width; } 
	public double getArea() { return this.getLength() * this.getWidth(); }
}
