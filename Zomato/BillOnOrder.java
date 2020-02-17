class BillOnOrder extends Order {
	private static double totalBill;
	BillOnOrder() {
		totalBill = 0.0;
	}
	public void calculateBill() {
		SoftDrinks drinks = new SoftDrinks();
		totalBill = super.getBurgerPrice() + super.getPizzaPrice() + drinks.getSoftDrinksCost();
		System.out.println("Total Bill Amount: " + totalBill);
	}
	public double getBillAmount() {
		SoftDrinks drinks = new SoftDrinks();
		return (super.getBurgerPrice() + super.getPizzaPrice() + drinks.getSoftDrinksCost());
	}
}
