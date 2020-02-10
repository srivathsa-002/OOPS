class Product{
	private String name;
	private double cost;
	public Product(String name,double cost) {
		this.name=name;
		this.cost=cost;
	}
	public double getCost() {
		return cost;
	}
	public void showProductDetails() {
		System.out.println("Item Details:");
		System.out.println("Name: " + name);
		System.out.println("Price: " + cost + " Rs");
	}
}