
import java.util.*;

public class StudentBookArray {
	private String email;
	private ArrayList <Book> books;	
	
	public StudentBookArray(String email, ArrayList <Book> books) {
		this.email = email;
		this.books = books;
	}	

	public StudentBookArray() {
		email = "";
		
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public ArrayList<Book> getBooks() {	//returns an array of books
		return books;
	}
	
	public Book getBook(int i) {
		return this.books.get(i);
	}
	
	public String getBooksDisplayed() { //returns a string of all books in one line
		String str  = email + "\n";
		for(int i = 0; i < books.size(); i++) 
			str += books.get(i).getName() ;
		return str;
	}
}
