import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validation validate = new Validation();
		validate.insertCard();
		validate.enterPin();
		Transaction transaction = new Transaction();
		transaction.displayChoices();
	}
}

interface ATM{
	final int transactionPin = 1234;
	public void insertCard();
	public boolean isCardValid();
}

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
class Transaction extends Validation{
	private double balance;
	Scanner sc = new Scanner(System.in);
	Transaction(){
		balance = 150000.0;
	}
	public void displayChoices() {
		if(super.isCardValid()) {
			System.out.println("1.Cash Withdraw");
			System.out.println("2.Cash Deposit");
			System.out.println("3.Check Balance");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: withdraw();
						break;
				case 2: deposit();
						break;
				case 3: System.out.println("Balance: " + getBalance());
						break;
				default : System.out.println("Inavlid Choice!!");
						 break;
			}
		}
		else
			System.out.println("Incorrect Pin!!");
	}
	
	public void withdraw() {
		System.out.println("Enter amount: ");
		double withdrawAmount = sc.nextDouble();
		if(withdrawAmount >= balance)
			balance -= withdrawAmount;
		System.out.println("Please collect cash of Rs." + withdrawAmount);
		System.out.println("Updated Balance: " + getBalance());
	}
	public void deposit() {
		System.out.println("Enter amount: ");
		double depositAmount = sc.nextDouble();
		balance += depositAmount;
		System.out.println("Please give cash of Rs." + depositAmount);
		System.out.println("Updated Balance: " + getBalance());
	}
	public double getBalance() {
		return balance;
	}
}

