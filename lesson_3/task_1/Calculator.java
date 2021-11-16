public class Calculator {
	private int firstNumber;
	private int secondNumber;

	public void setFirstNum(int number) { this.firstNumber = number; }
	public void setSecondNum(int number) { this.secondNumber = number; }
	public int getFirstNum() { return this.firstNumber; }
	public int getSecondNum() { return this.secondNumber; }

	public int calcAddition() { return this.firstNumber + this.secondNumber; }
	public int calcSubstraction() { return this.firstNumber - this.secondNumber; }
	public int calcMultiplication() { return this.firstNumber * this.secondNumber; }
	public double calcDivision() { return this.firstNumber / this.secondNumber; }
}
