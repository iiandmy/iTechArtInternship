public class Honda extends Car {
	public Honda(String name, int cylinders) { super(name, cylinders); }

	@Override
	public String accelerate() { return "Honda " + this.getName() + " cruising down the street."; }

	@Override
	public String startEngine() { return "Honda " + this.getName() + " started engine."; }

	@Override
	public String brake() { return "Honda " + this.getName() + " is stopped."; }
}
