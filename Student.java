import java.util.*;

public class Student {
	private String name, id, password;
	
	public Student(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public Student(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public Student() {
		name = "Unavailable";
		id = "";
		password = "";
	}

	
	public String getName() {
		return name;	}
	public String getid() {
		return id;	}
	public String getPassword() {
		return password;	}
	public ArrayList getCourseArr(){
		return courses;	}
	public ArrayList getBookArr(){
		return loanedBooks;	}
	public int totalLoaned() {
		return loanedBooks.size();	}
	public int totalCourses() {
		return courses.size();	}
	
	public void addCourse(Course course) {
		courses.addCourse(course);	}
	public void addBook(Book book) {
		loanedBooks.addBook(book);	}
	public void removeCourse(Course course) {
		courses.removeCourse(course);	}
	public void removeBook(Book book) {
		loanedBooks.removeBook(book);	}

	
	public String displayLoanedBooks() {
		return loanedBooks.displayBooks();	}
	public String displayCourses() {
		return courses.displayCourses();	}
	
		
	public void loan(Book book) {//Need to do***
		book.loan(this);
		loanedBooks.add(book);
	}
	
	
	public String toString() {
		if(!name.equals("Unavailable"))	//student exists
			return (name + " " + id + password + "\n");
		return "N/A\n\n";
	}

}
