//Inheritance
public class Cube extends Cuboid {
	//Encapsulation
	private double side;
	public Cube(double side) {
	    super(side, side,side);
	    this.side = side;
	}
	public double getSide() {
		return side;
	}
	//Polymorphism
    @Override
	public double calculateVolume() {
		return side*side*side;
	}
}
