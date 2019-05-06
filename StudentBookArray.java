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
		books = {};
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public ArrayList <Courses> getBooks() {	//returns an array of books
		return books;
	}
	
	public String getBooksDisplayed() { //returns a string of all books in one line
		String str = books.get(0);
		for(int i = 1; i < books.size(); i++) 
			str += " " + books.get(i).getName();
		return str;
	}
}