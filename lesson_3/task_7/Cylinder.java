public class Cylinder extends Circle {
	double height;

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height < 0 ? 0 : height;
	}

	public Cylinder(Circle base, double height) {
		super(base.getRadius());
		this.height = height < 0 ? 0 : height;
	}

	public double getHeight() { return this.height; }
	public double getVolume() { return this.height * this.getArea(); }
}
