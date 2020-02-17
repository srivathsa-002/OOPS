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
