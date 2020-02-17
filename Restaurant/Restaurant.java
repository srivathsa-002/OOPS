class Restaurant implements IMeal{
	private double pizzaPrice;
	private double burgerPrice;
	Restaurant(){
		pizzaPrice = 250.0;
		burgerPrice = 225.0;
	}
	@Override
	public void servePizza() {
		// TODO Auto-generated method stub
		System.out.println("Serving Pizza");
	}
	public double getPizzaPrice() {
		return pizzaPrice;
	}
	public double getBurgerPrice() {
		return burgerPrice;
	}

	@Override
	public void serveBurger() {
		// TODO Auto-generated method stub
		System.out.println("Serving Burger");
	}
}
