import java.util.Scanner;

interface IPayment{
	public void makePayment();
}

public class Payment implements IPayment {
	
	public void makePayment() {
		CashPayment cash=new CashPayment();
		CardPayment card=new CardPayment();
		// TODO Auto-generated method stub
		System.out.println("Choose payment type:");
		System.out.println("1.Cash");
		System.out.println("2.Card");
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
			case 1: cash.makePayment();
					break;
			case 2: card.makePayment();
					break;
			default: System.out.println("Enter valid choice!!");
					 break;
		}
	}
}
