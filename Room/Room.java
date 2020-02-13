public class Room {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid cuboid = new Cuboid(3.0,4.0,5.0);
		Cube cube = new Cube(6.0);
		Sphere sphere = new Sphere(3.0);
		VolumeCalculator vol = new VolumeCalculator();
		System.out.println("Volume of room is " + vol.calculateShapeVolume(cuboid));
		System.out.println("Volume of room is " + vol.calculateShapeVolume(cube));
		System.out.println("Volume of room is " + vol.calculateShapeVolume(sphere));
	}
}

interface Shape {
	public double calculateVolume();
}

class VolumeCalculator {
	public double calculateShapeVolume(Shape shape){
		return shape.calculateVolume();
	}
}	 
class Cuboid implements Shape {
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
	public double calculateVolume() {
		return length*breadth*height;
	}
}

class Cube extends Cuboid {
	private double side;
	public Cube(double side) {
	    super(side, side,side);
	    this.side = side;
	}
	public double getSide() {
		return side;
	}
	public double calculateVolume() {
		return side*side*side;
	}
}
class Sphere implements Shape {
	private double radius;
	Sphere(double radius){
		this.radius = radius;
	}
    public double getRadius() {
    	return radius;
    }
	public double calculateVolume() {
	  return (((22*4*radius*radius*radius)/7)/3);
	}
}