interface GrandFather{
	public void grandFatherGenes();
}
interface GrandMother{
	public void grandMotherGenes();
}
	public class Father implements GrandFather,GrandMother{
	private int age;
	public Father(){
		this.age=34;
	}
	public void grandFatherGenes() {
		System.out.println("I have my Father genes");
	}
	public void grandMotherGenes() {
		System.out.println("I have my Mother genes");
	}
	public void myGenes() {
			System.out.println("I have my(Father) own genes");
	}
}

class Son extends Father{
	private int age;
	public Son() {
		this.age=8;
	}
	public void myGenes() {
		super.myGenes();
		System.out.println("I have my(Son) own genes");
	}
}