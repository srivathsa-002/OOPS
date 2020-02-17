class InkPen extends Pen {
    public InkPen(String brand,String colour) {
    	super(brand,colour);
    }
    public void displayDetails() {
    	System.out.println("Brand: " + brand + "\nColour: " + colour);
    }
}