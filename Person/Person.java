class Person implements IPerson,IDisplayDetails {
	private String name;
	private int age;
	Person(String name,int age) {
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void displayDetails() {
		System.out.println("Person Details.....");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
	}
}