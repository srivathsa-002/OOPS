import java.util.Scanner;

public class Transactions {
	private int choice;
	Scanner sc = new Scanner(System.in);
	Account a1=new Account();
	Account a2=new Account();
	Transactions(Account a1,Account a2){
		this.a1=a1;
		this.a2=a2;
	}
	public void choices() {
		System.out.println("Welcome... Choose something:");
		System.out.println("1.Check balance");
		System.out.println("2.Transfer amount");
		System.out.println("3.Show Loan Account Details");
		System.out.println("4.Exit");
		System.out.println("Enter choice:" );
		choice = sc.nextInt();
	}
	public void interact() {
		switch(choice) {
			case 1: System.out.println("A/c Balance is: " + a1.getBalance());
					break;
			case 2: System.out.println("Enter a/c no of recipient: ");
					String recipientAcNo=sc.next();
					if(recipientAcNo.equals(a2.getAcNo())) {
						System.out.println("Enter Amount to be transferred: ");
						Double amount=sc.nextDouble();
						if(amount<=a1.getBalance()) {
							System.out.println("Enter PIN:");
							int pin=sc.nextInt();
							if(pin==a1.getPin()) {
								a1.setBalance(-amount);
								System.out.println("Transaction Succesful to " + recipientAcNo);
								break;
							}
							else {
								System.out.println("Incorrect PIN");
								break;
							}
						}
						else {
							System.out.println("Insufficient Funds!!");
							break;
						}
					}
					else {
						System.out.println("Enter Valid A/c No!!");
						break;
					}
			case 4: System.out.println("Thank You!!");
					break;
			case 3: ILoan iloan=new LoanAccount(a1);
					iloan.showLoanDetails();
					break;
			default: System.out.println("Invalid Choice");
					 break;
		}
	}
}