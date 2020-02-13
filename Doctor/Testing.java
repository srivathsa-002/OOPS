public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor dental = new DentalDoctor();
		dental.setName("ASDFGHJKL");
		System.out.println(dental.getName());
		dental.description();
		dental.specialization();
		Doctor skin = new SkinDoctor();
		skin.setName("ZXCVBNM");
		System.out.println(skin.getName());
		skin.description();
		skin.specialization();
	}
}

abstract class Doctor {
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

class DentalDoctor extends Doctor {
	@Override
	public void specialization() {
		// TODO Auto-generated method stub
		System.out.println("Specialization: Dental");
	}
}

class SkinDoctor extends Doctor {
	@Override
	public void specialization() {
		// TODO Auto-generated method stub
		System.out.println("Specialization: Skin");
	}
}
