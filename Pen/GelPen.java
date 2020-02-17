class GelPen extends Pen {
    public GelPen(String brand,String colour) {
    	super(brand,colour);
    }
    public void displayDetails() {
    	System.out.println("Brand: " + brand + "\nColour: " + colour);
    }
}