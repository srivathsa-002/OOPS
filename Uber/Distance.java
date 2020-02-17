import java.util.Scanner;

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