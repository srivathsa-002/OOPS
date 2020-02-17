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
