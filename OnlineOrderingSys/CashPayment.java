public class CashPayment extends Payment{
	public void makePayment() {
		Cart c = new Cart();
		System.out.println("You can pay" + c.bill() + " on delivery. Thank you.");
		System.out.println("Item will be delivered soon!!");
	}
}
