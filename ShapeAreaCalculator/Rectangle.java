class Rectangle implements IAreaCalculator {
	private double length;
	private double breadth;
	public Rectangle(double length,double breadth) {
		this.breadth = breadth;
		this.length = length;
	}
	/*public void setBreadth(double breadth) {
    	this.breadth = breadth;
    }
    public void setLength(double length) {
    	this.length = length;
    }*/
    public double getLength() {
    	return length;
    }
    public double getBreadth() {
    	return breadth;
    }
	public double calculateArea() {
		return length*breadth;
	}
}
