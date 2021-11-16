public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setFirstNum(12);
		calculator.setSecondNum(3);
		System.out.println(
				"ADD: " + calculator.calcAddition() + "\n" +
				"SUB: " + calculator.calcSubstraction() + "\n" +
				"MUL: " + calculator.calcMultiplication() + "\n" +
				"DIV: " + calculator.calcDivision()
				);
	}
}
