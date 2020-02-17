import java.util.Scanner;

class Options{
	private int choice;
	Scanner sc = new Scanner(System.in);
	public void display() {
		Cab cab = new Cab();
		Bike bike =  new Bike();
		Distance distance = new Distance();
		System.out.println("1.Book Cab");
		System.out.println("2.Book Bike");
		System.out.println("Enter choice:");
		choice = sc.nextInt();
		switch(choice) {
		case 1: cab.bookCab();
				distance.enterDistance();
				cab.calculateFare();
				System.out.println("Fare: " + cab.getCost());
				break;
		case 2: bike.bookBike();
				distance.enterDistance();
				bike.calculateFare();
				System.out.println("Fare: " + bike.getCost());
				break;
		default: System.out.println("Invalid Choice!!");
				 break;
		}
	}
}
