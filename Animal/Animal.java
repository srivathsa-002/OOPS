//Abstraction
abstract class Animal {
	//Encapsulation
	protected int noOfLegs;
	Animal(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public void eat() {
		System.out.println("This eats food!!");
	}
	public void walk() {
		System.out.println("This walks!!");
	}
	public abstract int getLegs();
}
