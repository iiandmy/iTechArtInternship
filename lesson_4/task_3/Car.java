public class Car {
	private boolean engine = true;
	private int wheels = 4;
	private String name;
	private int cylinders = 4;

	public Car(String name, int cylinders) {
		this.name = name;
		this.cylinders = cylinders;
	}

	public String startEngine() { return "Car engine started."; }
	public String accelerate() { return "Car is cruising down the street."; }
	public String brake() { return "Car is stopped."; }

	public String getName() { return this.name; }
	public int getCylinders() { return this.cylinders; }
}
