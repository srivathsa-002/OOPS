import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Options options =new Options();
		options.display();
	}
}

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

interface UberCab{
	public void bookCab();
}
interface UberBike{
	public void bookBike();
}
class Distance {
	private static double distance;
	Scanner sc = new Scanner(System.in);
	public void enterDistance(){
		System.out.println("Enter total distance: ");
		distance = sc.nextDouble();
	}
	public double getDistance() {
		return distance;
	}
}

class Cab extends Distance implements UberCab{
	private static double cost;
	public void bookCab() {
		System.out.println("Booking Cab...!!!");
	}
	public void calculateFare() {
		double distance = super.getDistance();
		if(distance > 0.0 && distance < 3.0)
			cost = distance*15;
		else if(distance >= 3.0 && distance < 6.0)
			cost = distance*25;
		else if(distance > 6.0 && distance < 10.0)
			cost = distance*30;
		else
			cost = distance*35;
	}
	public double getCost() {
		return cost;
	}
}

class Bike extends Distance implements UberBike{
	private double cost;
	public void bookBike() {
		System.out.println("Booking Bike...!!!");
	}
	public void calculateFare() {
		double distance = super.getDistance();
		if(distance > 0.0 && distance < 3.0)
			cost = distance*8;
		else if(distance >= 3.0 && distance < 6.0)
			cost = distance*9;
		else if(distance > 6.0 && distance < 10.0)
			cost = distance*10;
		else
			cost = distance*12;
	}
	public double getCost() {
		return cost;
	}
}
