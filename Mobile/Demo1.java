package basics.oop;
import java.util.ArrayList;
public class Demo1 {
	public static void main(String[] args) {
		Contact con=new Contact();
		con.addContact("6473264763");
		con.addContact("3456789000");
		System.out.println("Contacts available are: " + con.getContacts());
		Calling calling=new Calling("3456789000");
		calling.call();
		Messaging message = new Messaging("Hello... Howz you?");
		message.sendMessage();
	}
}

interface IContact{
	ArrayList<String> contacts = new ArrayList<String>();

	public void addContact(String contact);
}
abstract class MobileCall {
	public abstract void call();
}
abstract class MobileMessage {
	public abstract void sendMessage();
}

class Calling extends MobileCall {
	private String number;
	Calling(String number){
		this.number=number;
	}
	@Override
	public void call() {
		System.out.println("Calling " + number);
	}
	public String getNumber() {
		return number;
	}
}
class Messaging extends MobileMessage {
	private String message;
	Messaging(String message){
		this.message = message;
	}
	@Override
	public void sendMessage() {
		Calling calling = new Calling("1234567890");
		System.out.println("Sending message to " + calling.getNumber() + ": " + message);
	}
}
class Contact implements IContact{
	public ArrayList<String> getContacts() {
		return contacts;
	}
	@Override
	public void addContact(String contact) {
		contacts.add(contact);
	}
}