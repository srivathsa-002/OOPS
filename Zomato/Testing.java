public class Testing {
	public static void main(String[] args) {
		Order order = new Order();
		order.orderPizza();
		order.orderBurger();
		SoftDrinks bottle = new SoftDrinks();
		bottle.setBottleType("Glass");
		System.out.println("Bottle Type: " + bottle.getBottleType());
		bottle.setBottleQuantityInMl(200);
		System.out.println("Bottle Quantity: " + bottle.getBottleQuantityInMl());
		BillOnOrder bill = new BillOnOrder();
		bill.calculateBill();
		IPayment pay=new Payment();
		pay.makePayment();
	}
}