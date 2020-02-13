//Abstraction
abstract class IceCream {
	//Encapsulation
	private String brand;
	IceCream(String brand) {
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
