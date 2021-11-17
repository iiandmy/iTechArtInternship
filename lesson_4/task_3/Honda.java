public class Honda extends Car {
	public Honda(String name, int cylinders) { super("Honda " + name, cylinders); }

	@Override
	public String accelerate() { return this.getName() + " cruising down the street."; }

	@Override
	public String startEngine() { return this.getName() + " started engine."; }

	@Override
	public String brake() { return this.getName() + " is stopped."; }
}
