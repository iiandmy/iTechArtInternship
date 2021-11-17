public class Bedroom {
	private String name;
	private Lamp lamp;
	private Ceiling ceiling;
	private Bed bed;
	private Wall[] walls;

	public Bedroom(String name, Lamp lamp, Ceiling ceiling, Bed bed, Wall[] walls) {
		this.name = name;
		this.lamp = lamp;
		this.ceiling = ceiling;
		this.bed = bed;
		this.walls = walls;
	}

	public Lamp getLamp() { return this.lamp; }
	public void makeBad() { this.bed.make(); }
}
