import java.util.*;

public class Course {
	String name;
	ArrayList<Book> availBooks = new ArrayList<Book>();
	Boolean active;
		
	public Course(String name, ArrayList<Book> availBooks) {
		this.name = name;
		this.availBooks = availBooks;
	}
	
	public Course(String name) {
		this.name = name;	
	}
	
	
	
	public String getName() {
		return name;	}
	
	public ArrayList<Book> getBooks() {
		return availBooks;	}
	
	public void addBook(Book book) {
		availBooks.add(book);	}
	
	
	
	
	public String toString() {
		return (name );
	}
	

}
