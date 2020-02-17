class CashPayment extends Payment{
	public void makePayment() {
		BillOnOrder bill = new BillOnOrder();
		System.out.println("You can pay " + bill.getBillAmount() + " on delivery. Thank you.");
		System.out.println("Parcel will be delivered very soon!!");
	}
}