class SoftDrinks implements IBottle {
	private String type;
	private int quantity;
	private double cost;
	SoftDrinks() {
		cost = 20.0;
	}
	public void setBottleType(String type) {
		this.type=type;
	}
	public String getBottleType() {
		return type;
	}
	public void setBottleQuantityInMl(int quantity) {
		this.quantity=quantity;
	}
	public int getBottleQuantityInMl() {
		return quantity;
	}
	public double getSoftDrinksCost() {
		return cost;
	}
}
