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
