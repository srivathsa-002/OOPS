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