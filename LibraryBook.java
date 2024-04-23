public class LibraryBook implements Book {
	private String isbn;
	private String title;
	private String author;
	private int year;
	private boolean available;

	public LibraryBook(Book book) {
		    
	}

	public LibraryBook(String isbn, String title, String author, int year) {
		    this.isbn = getIsbn();
			this.title = getTitle();
			this.author = getTitle();
			this.year = getYear();
			this.available = true;
	}

	@Override
	public String getIsbn() { return this.isbn; }// return isbn
	public String getTitle() {return this.title; }// return title
	public String getAuthor() {return this.author; }// return author
	public int getYear() {return this.year;}// return year
	public boolean isAvailable() {return this.available;} // return available
	public void setAvailable(boolean available) {
		this.available = true;
	}
}
