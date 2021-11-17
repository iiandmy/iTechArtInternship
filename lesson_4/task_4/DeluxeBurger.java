public class DeluxeBurger extends Hamburger {
	private static final double fixingsPrice = .7d;
	private static final double chipsPrice = 1.5d;
	private static final double colaPrice = 2.0d;
	private static final double deluxePrice = 14.90d;

	public DeluxeBurger() {
		super("Deluxe Burger", "beaf", "Toast", deluxePrice);
		super.addAddition("fixings", fixingsPrice);
		super.addAddition("chips", chipsPrice);
		super.addAddition("cola", colaPrice);
	}

	@Override
	public void addAddition(String name, double price) {
		System.out.println("No additions can be added to deluxe combo.");
	}
}
