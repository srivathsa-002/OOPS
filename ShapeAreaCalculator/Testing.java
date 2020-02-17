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