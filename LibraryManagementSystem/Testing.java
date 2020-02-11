public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Heelo World","ASDSASD",1,4);
		Book book2 = new Book("AJXAN","ASDSASD",2,2);
		Customer customer1 = new Customer(1,"MIKE","0987654321",2);
		Customer customer2 = new Customer(2,"KJNKJIKE","1234567890",6);
		Library library1 = new Library("Heelo World","ASDSASD",1,4);
		customer1.customerDetails();
		library1.checkIfBooksAreAvailable(customer1);
		Library library2 = new Library("AJXAN","ASDSASD",2,2);
		customer2.customerDetails();
		library2.checkIfBooksAreAvailable(customer2);
	}

}
interface ILibrary {
	public void bookDetails();
}
class Book implements ILibrary{
	private String name;
	private String author;
	private int id;
	private int noOfBooks;
	Book(String bookName,String authorName,int id,int booksAvailable){
		this.name = bookName;
		this.author = authorName;
		this.id = id;
		this.noOfBooks = booksAvailable;
	}
	public String getName() {
		return name;
	}
	public String getAuthorName() {
		return author;
	}
	public int getId() {
		return id;
	}
	public int booksAvailable() {
		return noOfBooks;
	}
	public void setBooksAvailable(int count) {
		noOfBooks += count;
	}
	public void bookDetails() {
		System.out.println("Book details are: ");
		System.out.println("Title: " + getName());
		System.out.println("Author: " + getAuthorName());
		System.out.println("ID: " + getId());
	}
}
class Library extends Book {
	Library(String bookName,String authorName,int id,int booksAvailable){
		super(bookName,authorName,id,booksAvailable);
	}
	public void checkIfBooksAreAvailable(Customer customer) {
		super.bookDetails();
		if(super.booksAvailable() > 0) {
			System.out.println("Book is available!!");
			if(checkIfAllowedToBorrow(customer)) {
				super.setBooksAvailable(-1);
				System.out.println("You can take the book!!");
				customer.setBorrowedBooksCount(1);
				
			}
			else
				System.out.println("Sorry... You can't take the book!!\nPlease return some books");
		}
		else
			System.out.println("Sorry... Book isn't available!!");
	}
	public boolean checkIfAllowedToBorrow(Customer customer) {
		if(customer.getBorrowedBooksCount() < 5)
			return true;
		return false;
	}
}
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
