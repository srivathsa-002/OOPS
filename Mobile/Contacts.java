import java.util.ArrayList;

class Contact implements IContact {
	public ArrayList<String> getContacts() {
		return contacts;
	}
	@Override
	public void addContact(String contact) {
		contacts.add(contact);
	}
}