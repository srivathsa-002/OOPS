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
