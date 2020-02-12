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

interface Screen {
	public void screenDetails();
}
class Tv implements Screen {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void screenDetails() {
		// TODO Auto-generated method stub
		System.out.println("This has a TV Screen!!!!");
	}
}
class ComputerAndLaptopCommonParts implements Screen {
	@Override
	public void screenDetails() {
		// TODO Auto-generated method stub
		System.out.println("This has a Monitor Screen!!!!");
	}
	
	public void keyboardDetails() {
		System.out.println("This has a Keyboard");
	}
	public void mouseDetails() {
		System.out.println("This has a Mouse");
	}
}
class Laptop extends ComputerAndLaptopCommonParts {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void cpuDetails() {
		System.out.println("This has an in-built CPU");
	}
	
	public void laptopDetails() {
		screenDetails();
		keyboardDetails();
		mouseDetails();
		cpuDetails();
	}
}
class Computer extends ComputerAndLaptopCommonParts {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void cpuDetails() {
		System.out.println("This has an external CPU");
	}
	
	public void computerDetails() {
		screenDetails();
		keyboardDetails();
		mouseDetails();
		cpuDetails();
	}
}