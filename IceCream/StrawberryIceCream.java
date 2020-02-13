//Inheritance
class StrawberryIceCream extends IceCream {
	StrawberryIceCream(String brand) {
		super(brand);
	}
	//Polymorphism
	@Override
	public void myFlavour() {
		System.out.println("My Flavour is Strawberry");
	}
}
