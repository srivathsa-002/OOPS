public class Tset {
	public static void main(String[] args) {
		Father f=new Father();
		System.out.println("Father class genes:");
		f.grandFatherGenes();
		f.grandMotherGenes();
		f.myGenes();
		Son s=new Son();
		System.out.println("Son class genes:");
		s.myGenes();
	}
}