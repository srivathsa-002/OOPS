public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird(2);
		System.out.println(bird.getClass());
		System.out.println("No. of legs: " + bird.getLegs());
		bird.walk();
		bird.eat();
		bird.fly();
		Dog dog = new Dog(4);
		System.out.println(dog.getClass());
		System.out.println("No. of legs: " + dog.getLegs());
		dog.walk();
		dog.eat();
		dog.bark();
	}
}

abstract class Animal {
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
interface IBird {
	public void fly();
}

class Bird extends Animal implements IBird {
	Bird(int noOfLegs){
		super(noOfLegs);
	}
	@Override
	public int getLegs() {
		// TODO Auto-generated method stub
		return noOfLegs;
	}
	public void fly() {
		System.out.println("This flies!!");
	}
}

interface IDog {
	public void bark();
}

class Dog extends Animal implements IDog {
	Dog(int noOfLegs) {
		super(noOfLegs);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getLegs() {
		// TODO Auto-generated method stub
		return noOfLegs;
	}
	public void bark() {
		System.out.println("This barks!!");
	}
}