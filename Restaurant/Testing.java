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




