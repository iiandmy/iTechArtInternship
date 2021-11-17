public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer(10, true);
		System.out.println("printed " + printer.printPages(10) + " pages");
	}
}
