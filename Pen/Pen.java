abstract class Pen {
	public String colour;
	public String brand;
    public Pen(String brand,String colour) {
        this.brand = brand;
        this.colour = colour;
    }
    public abstract void displayDetails();
}