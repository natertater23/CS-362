import java.util.*;

public class Course {
	String name;
	ArrayList<Book> availBooks = new ArrayList<Book>();
	ArrayList<Book> loanedBooks = new ArrayList<Book>();
	ArrayList<Book> allBooks = new ArrayList<Book>();
	Boolean active;
		
	public Course(String name, ArrayList<Book> availBooks, boolean active) {
		this.name = name;
		this.availBooks = availBooks;
		this.allBooks = availBooks;
		this.active = active;
	}
	public Course(String name, boolean active) {
		this.name = name;	
		this.active = active;
	}
	
	
	
	public String getName() {
		return name;	}
	public ArrayList<Book> getAvailBooksList() {
		return availBooks;	}
	public ArrayList<Book> getLoanedBooksList() {
		return loanedBooks;	}
	public ArrayList<Book> getAllBooksList() {
		return allBooks;	}
	public boolean isActive() {
		return active;	}
	
	
	public void addBook(Book book) {
		availBooks.add(book);	
		allBooks.add(book);
	}
	public void removeBook(Book book) {
		if(loanedBooks.contains(book))
			throw new IllegalArgumentException("Book is currently loaned, it must be returned first.");
		availBooks.remove(book);
		allBooks.remove(book);
	}
	
	
	public void activate() {
		active = true;	}
	public void deactivate() {
		active = false;	}
	
	
	public String toString() {
		String output = name + " has books ";
		for(int i = 0; i < availBooks.size(); i++) {
			output += availBooks.get(i).getName() + " ";
		}
		output += " available and is ";
		if(active)
			output += "active";
		else
			output += "inactive";
		return output;
	}
	

}
