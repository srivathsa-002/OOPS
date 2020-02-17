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
