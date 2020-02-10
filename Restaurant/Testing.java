/*Build a restaurant that serves Pizza, Burger which implements a meal class. Soft drinks that implement bottle class.*/

public class Testing{
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		restaurant.servePizza();
		restaurant.serveBurger();
		SoftDrinks bottle = new SoftDrinks();
		bottle.setBottleType("Glass");
		System.out.println("Bottle Type:" + bottle.getBottleType());
		bottle.setBottleQuantityInMl(200);
		System.out.println("Bottle Quantity: " + bottle.getBottleQuantityInMl());
		BillOnMeal bill = new BillOnMeal();
		bill.calculateBill();
	}
}
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
interface IMeal{
	public void servePizza();
	public void serveBurger();
}

interface IBottle{
	public void setBottleType(String type);
	public void setBottleQuantityInMl(int quantity);
}

class SoftDrinks implements IBottle{
	private String type;
	private int quantity;
	public void setBottleType(String type) {
		this.type=type;
	}
	public String getBottleType() {
		return type;
	}
	public void setBottleQuantityInMl(int quantity) {
		this.quantity=quantity;
	}
	public int getBottleQuantityInMl() {
		return quantity;
	}
}
