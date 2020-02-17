class BillOnMeal extends Restaurant{
	private double totalBill;
	BillOnMeal(){
		totalBill = 0.0;
	}
	public void calculateBill() {
		totalBill = super.getBurgerPrice() + super.getPizzaPrice();
		System.out.println("Total Bill Amount: " + totalBill);
	}
}
