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
