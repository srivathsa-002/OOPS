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
