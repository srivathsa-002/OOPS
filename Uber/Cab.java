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