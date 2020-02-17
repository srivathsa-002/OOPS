public class Testing {
	public static void main(String[] args) {
		Tv tele = new Tv();
		tele.setName("SAMSUNG TV");
		System.out.println("\nName: " + tele.getName());
		tele.screenDetails();
		Computer comp = new Computer();
		comp.setName("HP PC");
		System.out.println("\nName: " + comp.getName());
		comp.computerDetails();
		Laptop laptop = new Laptop();
		laptop.setName("DELL Laptop");
		System.out.println("\nName: " + laptop.getName());
		laptop.laptopDetails();
	}
}