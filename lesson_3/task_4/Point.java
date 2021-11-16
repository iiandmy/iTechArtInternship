public class Point {
	private int x;
	private int y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }

	public int getX() { return this.x; }
	public int getY() { return this.y; }

	public double distance() { return this.distance(0, 0); }
	public double distance(int x, int y) { return this.distance(new Point(x, y)); }
	public double distance(Point p) { return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)); }
}
