public class HealthyBurger extends Hamburger {
	private double[] healthyExtrasPrices;
	private String[] healthyExtrasNames;
	private int extrasCount;

	private static final int maxExtras = 2;

	public HealthyBurger(String meat, double price) {
		super("Healthy burger", meat, "toast", price);
		healthyExtrasNames = new String[maxExtras];
		healthyExtrasPrices = new double[maxExtras];
		extrasCount = 0;
	}

	public void addHealthyExtra(String name, double price) {
		if (extrasCount >= maxExtras)
			return;

		healthyExtrasNames[extrasCount] = name;
		healthyExtrasPrices[extrasCount] = price;
		extrasCount++;
	}
	
	@Override
	public double calculateTotalPrice() {
		double totalPrice = super.calculateTotalPrice();
		for (int i = 0; i < extrasCount; i++)
			totalPrice += healthyExtrasPrices[i];

		return totalPrice;
	}

	@Override
	public String getName() {
		StringBuilder sb = new StringBuilder().append(super.getName()).append("with healthy extras: ");

		for (int i = 0; i < extrasCount; i++)
			sb.append(healthyExtrasNames[i] + ", ");

		return sb.toString();
	} 
}
