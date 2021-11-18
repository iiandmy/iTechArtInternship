import java.util.ArrayList;

public class Phone {
	private String number;
	private ArrayList<Contact> contacts;

	public Phone(String number) {
		this.number = number;
		this.contacts = new ArrayList<>();
	}

	public boolean addContact(Contact contact) {
		if (findContact(contact.getNumber()) != -1)
			return false;

		this.contacts.add(contact);
		return true;
	}

	public boolean updateContact(Contact oldC, Contact newC) {
		if (findContact(oldC) == -1)
			return false;

		this.contacts.remove(oldC);
		this.contacts.add(newC);

		return true;
	}

	public boolean removeContact(Contact contact) {
		if (findContact(contact) == -1)
			return false;

		this.contacts.remove(contact);
		return true;
	}

	public int findContact(Contact contact) {
		return findContact(contact.getNumber());
	}

	public int findContact(String number) {
		for (Contact c : this.contacts) {
			if (c.getNumber().equals(number))
				return this.contacts.indexOf(c);
		}

		return -1;
	}

	public Contact queryContact(String number) {
		return this.contacts.get(findContact(number));
	}

	public void printContacts() {
		System.out.println("Contacts list:");
		this.contacts.forEach(contact -> {
			System.out.println(contact.getName() + " -> " + contact.getNumber());
		});
	}
}
