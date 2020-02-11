public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(4.0,5.0);
		System.out.println("Area of rectangle is " + rect.calculateArea());
		Rectangle square = new Square(6.0);
		System.out.println("Area is " + square.calculateArea());
		Circle circle = new Circle(3.0);
		System.out.println("Area is " + circle.calculateArea());
	}
}
interface IAreaCalculator {
	  public double calculateArea();
}
	 
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

class Square extends Rectangle {
	private double side;
	public Square(double side) {
	    super(side, side);
	    this.side = side;
	}
	public double getSide() {
		return side;
	}
	public double calculateArea() {
		return side*side;
	}
}
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