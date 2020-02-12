abstract class Pen {
	public String colour;
	public String brand;
    public Pen(String brand,String colour) {
        this.brand = brand;
        this.colour = colour;
    }
    public abstract void displayDetails();
}

class GelPen extends Pen {
    public GelPen(String brand,String colour) {
    	super(brand,colour);
    }
    public void displayDetails() {
    	System.out.println("Brand: " + brand + "\nColour: " + colour);
    }
}

class InkPen extends Pen {
    public InkPen(String brand,String colour) {
    	super(brand,colour);
    }
    public void displayDetails() {
    	System.out.println("Brand: " + brand + "\nColour: " + colour);
    }
}

interface IClick {
	public String clickDetails();
}

class BallPen extends Pen implements IClick {
    public BallPen(String brand,String colour) {
    	super(brand,colour);
    }
    public String clickDetails() {
    	return "This is a Click Pen.";
    }
    public void displayDetails() {
    	System.out.println("Brand: " + brand + "\nColour: " + colour + "\nDescription: " + clickDetails());
    }
}

public class Testing {
    public static void main(String[] args) {
    	Pen pen1 = new GelPen("Octane","Blue");
    	Pen pen2 = new InkPen("Old Model","Red");
    	Pen pen3 = new BallPen("Cello","Black");
    	System.out.println(pen1.getClass());
    	pen1.displayDetails();
    	System.out.println(pen2.getClass());
    	pen2.displayDetails();
    	System.out.println(pen3.getClass());
    	pen3.displayDetails();
    }
}