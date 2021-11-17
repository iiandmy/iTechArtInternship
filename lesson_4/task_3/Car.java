public class Car {
	private boolean engine;
	private int wheels;
	private String name;
	private int cylinders = 4;

	public Car(String name, int cylinders) {
		this.name = name;
		this.cylinders = cylinders;
		this.engine = true;
		this.wheels = 4;
	}

	public String startEngine() { return "Car engine started."; }
	public String accelerate() { return "Car is cruising down the street."; }
	public String brake() { return "Car is stopped."; }

	public String getName() { return this.name; }
	public int getCylinders() { return this.cylinders; }
}
