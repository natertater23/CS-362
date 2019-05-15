import java.util.*;

public class Student {
	private String name, email, password;
	ArrayList<Course> courses = new ArrayList<Course>();
	ArrayList<Book> loanedBooks = new ArrayList<Book>();
	
	public Student(String name, String email, String password, ArrayList courses, ArrayList loanedBooks) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.courses = courses;
		this.loanedBooks = loanedBooks;
	}
	
	public Student(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public Student() {
		name = "Unavailable";
		email = "";
		password = "";
	}

	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void editPassword(String newPassword) {
		email = newPassword;
	}
	
	public void loan(Book book) {
		loanedBooks.add(book);
	}
	
	public void viewLoaned() {
		for(int i = 0; i < loanedBooks.size(); i++) {
			 // print to the loaned book section
		}
		
	}
	public String toString() {
		if(!name.equals("Unavailable"))	//student exists
			return (name + " " + email +  " " + password);
		return "N/A\n\n";
	}

}
