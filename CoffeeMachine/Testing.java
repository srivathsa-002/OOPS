public class Testing {
	public static void main(String[] args) {
		Milk milk = new Milk();
		CoffeeMachineWorking working = new CoffeeMachineWorking();
		milk.setMilkContent(30.0);
		System.out.println("------Test Case 1------");
		System.out.println("Milk capacity in machine is: " + milk.getMilkContent());
		working.interacting();
		//milk.setMilkContent(-20.0);
		System.out.println("------Test Case 2------");
		System.out.println("Milk capacity in machine is: " + milk.getMilkContent());
		working.interacting();
	}
}