//Abstraction
abstract class Doctor {
	//Encapsulation
	private String name;
	public String getName() {
		return "Name: " + name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void description() {
		System.out.println("I am a Doctor");
	}
	public abstract void specialization();
}
