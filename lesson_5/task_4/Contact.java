public class Contact {
	private String number;
	private String name;

	public Contact(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public boolean equals(Contact c) {
		return this.getNumber() == c.getNumber();
	}

	public String getName() { return this.name; }
	public String getNumber() { return this.number; }

	public void setName(String name) { this.name = name; }
	public void setNumber(String number) { this.number = number; }
}
