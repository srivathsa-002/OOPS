//Inheritance
class Dog extends Animal implements IDog {
	Dog(int noOfLegs) {
		super(noOfLegs);
	}
	//Polymorphism
	@Override
	public int getLegs() {
		return noOfLegs;
	}
	//Polymorphism
	@Override
	public void bark() {
		System.out.println("This barks!!");
	}
}