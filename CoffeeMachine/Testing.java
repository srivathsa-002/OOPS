import java.util.Scanner;

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

class Milk {
	private static double milkContent;
	public void getMilk() {
		System.out.println("Getting Milk");
	}
	public void setMilkContent(double capacity) {
		milkContent += capacity;
	}
	public double getMilkContent() {
		return milkContent;
	}
}
interface ISomeEspresso {
	public void getSomeEspresso();
}
interface ICompleteEspresso extends ISomeEspresso {
	public void getCompleteEspresso();
}

interface ICappucino extends ISomeEspresso {
	public void getCapuccino();
}

interface ILatte extends ISomeEspresso {
	public void getLatte();
}

class CoffeeMachine extends Milk implements ICompleteEspresso,ICappucino,ILatte {

	@Override
	public void getLatte() {
		// TODO Auto-generated method stub
		if(getMilkContent() >= 20.0 ) {
			getMilk();
			getSomeEspresso();
			System.out.println("Getting Latte");
			System.out.println("Mixing above contents....\nYOUR LATTE IS READY!!!!");
			setMilkContent(-20.0);
	
		}
		else {
			double addMilkQuantity =  20.0 - getMilkContent();
			System.out.println("Sorry Milk content is less... Please add atleast " + addMilkQuantity + " ml of milk");
		}
	}

	@Override
	public void getCapuccino() {
		// TODO Auto-generated method stub
		if(getMilkContent() > 30.0) {
			getMilk();
			getSomeEspresso();
			System.out.println("Getting Cappucino");
			System.out.println("Mixing above contents....\nYOUR CAPPUCINO IS READY!!!!");
			setMilkContent(-30.0);
		}
		else {
			double addMilkQuantity =  30.0 - getMilkContent();
			System.out.println("Sorry Milk content is less... Please add atleast " + addMilkQuantity + " ml of milk");
		}
	}

	@Override
	public void getCompleteEspresso() {
		// TODO Auto-generated method stub
		getSomeEspresso();
		System.out.println("YOUR ESPRESSO IS READY!!!!");
	}
	
	@Override
	public void getSomeEspresso() {
		// TODO Auto-generated method stub
		System.out.println("Getting Espresso");
	}
}