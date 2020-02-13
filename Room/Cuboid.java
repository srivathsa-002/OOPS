public class Cuboid implements IShape {
	//Encapsulation
	private double length;
	private double breadth;
	private double height;
	public Cuboid(double length,double breadth,double height) {
		this.breadth = breadth;
		this.length = length;
		this.height = height;
	}
    public double getLength() {
    	return length;
    }
    public double getBreadth() {
    	return breadth;
    }
    public double getHeight() {
    	return breadth;
    }
    //Polymorphism
    @Override
	public double calculateVolume() {
		return length*breadth*height;
	}
}
