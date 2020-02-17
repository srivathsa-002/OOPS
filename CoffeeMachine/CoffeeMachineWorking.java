import java.util.Scanner;

class CoffeeMachineWorking {
	public void interacting() {
		CoffeeMachine interact = new CoffeeMachine();
		System.out.println("Enter your choice: ");
		System.out.println("1.Cappucino");
		System.out.println("2.Espresso");
		System.out.println("3.Latte");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
			case 1: interact.getCapuccino();
					break;
			case 2: interact.getCompleteEspresso();
					break;
			case 3: interact.getLatte();
					break;
			default: System.out.println("Invalid choice :( ");
					 break;
		}
	}
}