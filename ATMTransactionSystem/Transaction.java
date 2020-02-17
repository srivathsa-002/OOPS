import java.util.Scanner;

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
