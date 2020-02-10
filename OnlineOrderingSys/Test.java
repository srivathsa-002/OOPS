public class Test {

	public static void main(String[] args) {
		Product p1=new Product("Toy",2400.0);
		p1.showProductDetails();
		Product p2=new Product("Gadget",25000.0);
		p2.showProductDetails();
		Address a = new Address("Zem","Hyd");
		Customer c = new Customer(a);
		c.getCustomerDetails();
		Cart cart=new Cart();
		c.addProduct(p1);
		c.addProduct(p2);
		cart.getProductList();
		IPayment pay=new Payment();
		pay.makePayment();
	}

}
