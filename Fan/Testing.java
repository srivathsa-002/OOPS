interface IFan{
	public void turnOn();
	public void turnOff();
	public void details();
}
class Fan implements IFan {
	private boolean isOn;
	public void turnOn() {
		this.isOn = true;
		System.out.println("Fan is spinning");
	}
	public void turnOff() {
		this.isOn = false;
		System.out.println("Fan is stopped");
	}
	public void details() {
		System.out.println("This is a Simple Fan!!");
	}
}

class TableFan extends Fan {
	@Override
	public void details() {
		System.out.println("This is a Table Fan!!");
	}
}

class CeilingFan extends Fan {
	@Override
	public void details() {
		System.out.println("This is a Ceiling Fan!!");
	}
}
public class Testing {
	public static void main(String[] args) {
		Fan fan = new Fan();
		System.out.println(fan.getClass() + " Details......");
		fan.details();
		fan.turnOn();
		fan.turnOff();
		TableFan tableFan = new TableFan();
		System.out.println("\n\n" + tableFan.getClass() + " Details......");
		tableFan.details();
		tableFan.turnOn();
		CeilingFan ceilingFan = new CeilingFan();
		System.out.println("\n\n" + ceilingFan.getClass() + " Details:");
		ceilingFan.details();
		ceilingFan.turnOn();
	}
}
