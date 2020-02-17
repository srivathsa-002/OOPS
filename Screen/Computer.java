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