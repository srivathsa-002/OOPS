public class Test {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAcNo("1234567890");
		a1.setBalance(1000000.0);
		a1.setName("ASDFGHJKL");
		a1.setPin(4567);
		Account a2 = new Account();
		a2.setAcNo("0987654321");
		Transactions t = new Transactions(a1,a2);
		t.choices();
		t.interact();
	}
}