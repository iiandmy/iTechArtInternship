public class Ford extends Car {
	public Ford(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String accelerate() {
		return "Ford " + this.getName() + " started ride.";
	}

	@Override
	public String startEngine() {
		return "Ford " + this.getName() + " started engine.";
	}

	@Override
	public String brake() {
		return "Ford " + this.getName() + " stopped.";
	}
}
