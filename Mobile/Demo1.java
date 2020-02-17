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
