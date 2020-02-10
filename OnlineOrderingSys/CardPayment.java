import java.util.Scanner;

public class CardPayment extends Payment {

	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Enter card number:");
		Scanner sc=new Scanner(System.in);
		String cardNum=sc.next();
		System.out.println("Enter CVV:");
		int cvv=sc.nextInt();
		if(cvv==123)
			System.out.println("PAyment Successful....Item will be delivered soon!!");
		else
			System.out.println("Wrong CVV!!");
	}
	
}