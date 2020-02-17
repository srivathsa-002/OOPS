class Order implements IZomato {
	private double pizzaPrice;
	private double burgerPrice;
	Order(){
		pizzaPrice = 250.0;
		burgerPrice = 225.0;
	}
	@Override
	public void orderPizza() {
		// TODO Auto-generated method stub
		System.out.println("Ordering Pizza");
	}
	public double getPizzaPrice() {
		return pizzaPrice;
	}
	public double getBurgerPrice() {
		return burgerPrice;
	}

	@Override
	public void orderBurger() {
		// TODO Auto-generated method stub
		System.out.println("Ordering Burger");
	}
}
