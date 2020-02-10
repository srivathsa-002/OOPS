public class Customer {
	private String custName;
	private String phoneNo;
	private Address address;
	public Customer(Address a) {
		this.custName="ASDFGHJKL";
		this.phoneNo="1234567890";
		this.address=a;
	}
	public void getCustomerDetails() {
		System.out.println("Customer Details:" + custName+","+address.getAddress()+","+phoneNo);
	}
	public void addProduct(Product p) {
		Cart c=new Cart();
		c.addToCart(p);
	}
}
