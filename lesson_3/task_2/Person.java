public class Person {
	private String firstName = "John";
	private String lastName = "Doe";
	private int age = 18;

	// Setters
	public void setFirstName(String fName) { this.firstName = fName; }
	public void setLastName(String lName) {this.lastName = lName; }
	public void setAge(int age) { this.age = age; }
	
	// Getters
	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
	public int getAge() { return this.age; }
	public String getFullName() { return (this.getFirstName() + " " + this.getLastName()).trim(); }

	public boolean isTeen() {
		if (this.getAge() > 12 && this.getAge() < 20)
			return true;

		return false;
	}
}
