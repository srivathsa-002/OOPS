import java.util.Scanner;

class CardPayment extends Payment {

	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Enter card number:");
		Scanner sc = new Scanner(System.in);
		String cardNum = sc.next();
		System.out.println("Enter CVV:");
		int cvv = sc.nextInt();
		if(cvv == 123)
			System.out.println("Payment Successful.... Parcel will be delivered very soon!!");
		else
			System.out.println("Wrong CVV!!");
	}
	
}
