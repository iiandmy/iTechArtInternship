import java.lang.StringBuilder;

public class Hamburger {
	private String name;
	private String meat;
	private String breadRollType;
	private double price;
	private double[] additionsPrice;
	private String[] additionsName;
	private int additionsCount;

	private static final int maxAdditions = 4;

	public Hamburger(String name, String meat, String breadRollType, double price) {
		this.name = name;
		this.meat = meat;
		this.breadRollType = breadRollType;
		this.price = price;
		this.additionsCount = 0;
		this.additionsPrice = new double[maxAdditions];
		this.additionsName = new String[maxAdditions];
	}

	public void addAddition(String name, double price) {
		if (additionsCount >= maxAdditions)
			return;

		additionsName[additionsCount] = name;
		additionsPrice[additionsCount] = price;
		additionsCount++;
	}

	public String itemizeHamburger() {
		double totalPrice = calculateTotalPrice();
		String hamburgerName = getName();

		return hamburgerName + "costs: " + totalPrice;
	}

	public double calculateTotalPrice() {
		double totalPrice = this.price;
		for (double p : additionsPrice)
			totalPrice += p;

		return totalPrice;
	}

	public String getName() {
		StringBuilder sb = new StringBuilder().append(this.name + " with " + this.meat + " on " + this.breadRollType + ", ");
		if (additionsCount == 0)
			return sb.toString();

		sb.append("with: ");
		for (int i = 0; i < additionsCount; i++)
			sb.append(additionsName[i] + ", ");

		return sb.toString();
	}
}
