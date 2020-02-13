//Inheritance
class ChocolateIceCream extends IceCream {
	ChocolateIceCream(String brand) {
		super(brand);
	}
	//Polymorphism
	@Override
	public void myFlavour() {
		System.out.println("My Flavour is Chocolate");
	}
}
