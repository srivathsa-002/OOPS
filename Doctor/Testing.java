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



