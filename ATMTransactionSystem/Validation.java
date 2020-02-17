import java.util.Scanner;

class Validation implements ATM{
	private static int pin;
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Inserting card.....");
	}
	public void enterPin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pin:");
		pin = sc.nextInt();
	}
	@Override
	public boolean isCardValid() {
		// TODO Auto-generated method stub
		if(pin == transactionPin)
			return true;
		return false;
	}
}
