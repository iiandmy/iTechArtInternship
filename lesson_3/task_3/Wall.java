public class Wall {
	private double height;
	private double width;

	public Wall() {
		this.height = .0d;
		this.width = .0d;
	}

	public Wall(double height, double width) {
		this.height = height;
		this.width = width;
	}

	// Setters
	public void setHeight(double height) { this.height = height; }
	public void setWidth(double width) { this.width = width; }

	// Getters
	public double getHeight() { return this.height; }
	public double getWidth() { return this.width; }
	public double getArea() { return this.getWidth() * this.getHeight(); }
}
