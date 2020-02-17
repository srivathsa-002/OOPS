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