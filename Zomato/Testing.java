import java.util.Scanner;
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

interface IZomato {
	public void orderPizza();
	public void orderBurger();
}

interface IBottle {
	public void setBottleType(String type);
	public void setBottleQuantityInMl(int quantity);
}

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

class SoftDrinks implements IBottle {
	private String type;
	private int quantity;
	private double cost;
	SoftDrinks() {
		cost = 20.0;
	}
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
	public double getSoftDrinksCost() {
		return cost;
	}
}


interface IPayment{
	public void makePayment();
}

class Payment implements IPayment {
	
	public void makePayment() {
		CashPayment cash=new CashPayment();
		CardPayment card=new CardPayment();
		// TODO Auto-generated method stub
		System.out.println("Choose payment type:");
		System.out.println("1.Cash");
		System.out.println("2.Card");
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
			case 1: cash.makePayment();
					break;
			case 2: card.makePayment();
					break;
			default: System.out.println("Enter valid choice!!");
					 break;
		}
	}
}
	

class CardPayment extends Payment {

	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Enter card number:");
		Scanner sc = new Scanner(System.in);
		String cardNum = sc.next();
		System.out.println("Enter CVV:");
		int cvv = sc.nextInt();
		if(cvv == 123)
			System.out.println("Payment Successful.... Parcel will be delivered very soon!!");
		else
			System.out.println("Wrong CVV!!");
	}
	
}

class CashPayment extends Payment{
	public void makePayment() {
		BillOnOrder bill = new BillOnOrder();
		System.out.println("You can pay " + bill.getBillAmount() + " on delivery. Thank you.");
		System.out.println("Parcel will be delivered very soon!!");
	}
}