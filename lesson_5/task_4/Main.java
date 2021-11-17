public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone("88005553535");
		phone.addContact(new Contact("Ziggy", "1234"));
		phone.addContact(new Contact("Stardust", "4321"));
		Contact john = new Contact("Not John", "777");
		phone.addContact(john);
		phone.addContact(new Contact("Sane", "4444"));

		phone.printContacts();

		phone.updateContact(john, new Contact("Actually John", "138"));

		phone.printContacts();
	}
}
