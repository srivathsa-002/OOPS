//Inheritance
class Bird extends Animal implements IBird {
	Bird(int noOfLegs){
		super(noOfLegs);
	}
	//Polymorphism
	@Override
	public int getLegs() {
		return noOfLegs;
	}
	//Polymorphism
	@Override	
	public void fly() {
		System.out.println("This flies!!");
	}
}
