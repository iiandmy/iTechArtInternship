public class CuboidPool extends Rectangle {
	double height;

	public CuboidPool(double length, double width, double height) {
		super(length, width);
		this.height = height < 0 ? 0 : height;
	}

	public double getHeight() { return this.height; }
	public double getVolume() { return this.getArea() * this.getHeight(); }
}
