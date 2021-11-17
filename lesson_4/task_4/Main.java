public class Main {
	public static void main(String[] args) {
		Hamburger cheezeburger = new Hamburger("Cheezeburger", "Beaf", "Toast", 4.20d);
		cheezeburger.addAddition("cheeze", 1.00d);
		cheezeburger.addAddition("pickles", .7d);
		cheezeburger.addAddition("tomatoes", .5d);
		cheezeburger.addAddition("second beaf", 1.5d);
		cheezeburger.addAddition("extra souce", .3d);

		HealthyBurger healthy = new HealthyBurger("beef", 5.50d);
		healthy.addAddition("leaf", .5d);
		healthy.addHealthyExtra("pickle", .7d);

		System.out.println(cheezeburger.itemizeHamburger() + "\n" + healthy.itemizeHamburger());
	}
}
