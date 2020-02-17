
class Milk {
	private static double milkContent;
	public void getMilk() {
		System.out.println("Getting Milk");
	}
	public void setMilkContent(double capacity) {
		milkContent += capacity;
	}
	public double getMilkContent() {
		return milkContent;
	}
}