class Circle implements IAreaCalculator {
	private double radius;
	Circle(double radius){
		this.radius = radius;
	}
	/*public void setRadius(double radius) {
    	this.radius = radius;
    }*/
    public double getRadius() {
    	return radius;
    }
	public double calculateArea() {
	  return (22*radius*radius)/7;
	}
}