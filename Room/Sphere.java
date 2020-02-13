public class Sphere implements IShape {
	//Encapsulation
	private double radius;
	Sphere(double radius){
		this.radius = radius;
	}
    public double getRadius() {
    	return radius;
    }
    //Polymorphism
    @Override
    public double calculateVolume() {
	  return (((22*4*radius*radius*radius)/7)/3);
	}
}