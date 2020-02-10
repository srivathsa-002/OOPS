import java.util.ArrayList;

public class Cart {
	static ArrayList<Product> list=new ArrayList<Product>();
	static double amount=0.0;
	public void addToCart(Product p) {
		list.add(p);
		amount += p.getCost();
	}
	public ArrayList<Product> getProductList(){
		return list;
	}
	public double bill() {
		return amount;
	}
}