public class Testing {
	public static void main(String[] args) {
		IceCream chocolate = new ChocolateIceCream("Scoops");
		chocolate.details();
		System.out.println(chocolate.getName());
		chocolate.myFlavour();
		IceCream strawberry = new StrawberryIceCream("Masqati");
		strawberry.details();
		System.out.println(strawberry.getName());
		strawberry.myFlavour();
	}
}

abstract class IceCream {
	private String brand;
	IceCream(String brand){
		this.brand = brand;
	}
	public String getName() {
		return "Manufacturer: " + brand;
	}
	public void details() {
		System.out.println("I am an IceCream");
	}
	public abstract void myFlavour();
}

class ChocolateIceCream extends IceCream {
	ChocolateIceCream(String brand) {
		super(brand);
	}
	public void myFlavour() {
		System.out.println("My Flavour is Chocolate");
	}
}

class StrawberryIceCream extends IceCream {
	StrawberryIceCream(String brand) {
		super(brand);
	}
	public void myFlavour() {
		System.out.println("My Flavour is Strawberry");
	}
}