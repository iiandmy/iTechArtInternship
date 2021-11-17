public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		this.tonerLevel = tonerLevel > -1 ? tonerLevel <= 100 ? tonerLevel : -1 : -1;
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}

	public int addToner(int tonerAmount) { 
		if (validateTonerAmount(tonerAmount) == false)
			return -1;

		return validateTonerAmount(tonerAmount + this.tonerLevel) ? this.tonerLevel += tonerAmount : -1; 
	}

	private boolean validateTonerAmount(int tonerAmount) {
		return tonerAmount > 0 && tonerAmount <= 100;
	}

	public int printPages(int pagesToPrint) {
		pagesToPrint = this.duplex ? (int) Math.floor(pagesToPrint / 2) : pagesToPrint;
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getPrintedPages() { return this.pagesPrinted; }
}
