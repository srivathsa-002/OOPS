class Customer {
	private String name;
	private int custId;
	private String phoneNo;
	private int borrowedBooks; 
	Customer(int custId,String name,String phoneNo,int borrowedBooks){
		this.custId = custId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.borrowedBooks = borrowedBooks;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public int getCustId() {
		return custId;
	}
	public String getCustName() {
		return name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public int getBorrowedBooksCount() {
		return borrowedBooks;
	}
	public void setBorrowedBooksCount(int count) {
		borrowedBooks += count;
	}
	public void customerDetails() {
		System.out.println("Customer details are: ");
		System.out.println("Name: " + getCustName());
		System.out.println("Phone No: " + getPhoneNo());
		System.out.println("Customer ID: " + getCustId());
		System.out.println("Borrowed Books: " + getBorrowedBooksCount());
	}
}
