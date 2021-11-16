public class Main {
	public static void main(String[] args) {
		ComplexNumber firstNumber = new ComplexNumber(4, 3);
		ComplexNumber secondNumber = new ComplexNumber(2, 2);
		ComplexNumber sumResult = firstNumber.calcSum(secondNumber);

		System.out.println(
				firstNumber.getReal() + " + " + firstNumber.getImaginary() + "i"
				+ " + " +
				secondNumber.getReal() + " + " + secondNumber.getImaginary() + "i"
				+ " = " +
				sumResult.getReal() + " + " + sumResult.getImaginary() + "i" 
				);
	}
}
