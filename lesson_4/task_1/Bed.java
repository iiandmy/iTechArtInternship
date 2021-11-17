public class Bed {
	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;

	public Bed(String style, int pillows, int height, int sheets, int quilt) {
		this.style = style;
		this.pillows = pillows;
		this.height = height < 0 ? 0 : height;
		this.sheets = sheets < 0 ? 0 : height;
		this.quilt = quilt < 0 ? 0 : quilt;
	}

	public void make() {
		System.out.println("Making bed..");
	}

	public String getStyle() { return this.style; }
	public int getPillows() { return this.pillows; }
	public int getHeight() { return this.height; }
	public int getSheets() { return this.sheets; }
	public int getQuilt() { return this.quilt; }
}
