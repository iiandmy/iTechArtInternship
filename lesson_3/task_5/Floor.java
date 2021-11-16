public class Floor {
	int area;

	public Floor(int width, int height) { this.area = width * height; }

	public Floor(int area) { this.area = area; }

	public int getArea() { return this.area; }
}
