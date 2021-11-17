public class Ford extends Car {
	public Ford(String name, int cylinders) {
		super("Ford " + name, cylinders);
	}

	@Override
	public String accelerate() {
		return this.getName() + " started ride.";
	}

	@Override
	public String startEngine() {
		return this.getName() + " started engine.";
	}

	@Override
	public String brake() {
		return this.getName() + " stopped.";
	}
}
