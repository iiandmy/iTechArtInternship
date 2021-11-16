public class ComplexNumber {
	double realPart;
	double imaginaryPart;

	public ComplexNumber(double real, double imaginary) {
		this.realPart = real;
		this.imaginaryPart = imaginary;
	}

	public void setReal(double real) { this.realPart = real; }
	public void setImaginary(double imaginary) { this.imaginaryPart = imaginary; }

	public double getReal() { return this.realPart; }
	public double getImaginary() { return this.imaginaryPart; }

	public ComplexNumber calcSum(double real, double imaginary) { return new ComplexNumber(this.getReal() + real, this.getImaginary() + imaginary); }
	public ComplexNumber calcSum(ComplexNumber cn) { return new ComplexNumber(this.getReal() + cn.getReal(), this.getImaginary() + cn.getImaginary()); }

	public ComplexNumber calcSub(double real, double imaginary) { return new ComplexNumber(this.getReal() - real, this.getImaginary() - imaginary); }
	public ComplexNumber calcSub(ComplexNumber cn) { return new ComplexNumber(this.getReal() - cn.getReal(), this.getImaginary() - cn.getImaginary()); }
}
