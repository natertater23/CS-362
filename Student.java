import java.util.*;

public class Student {
	private String name, email, password;//potential id
	StudentCourseArray courses = new StudentCourseArray();
	StudentBookArray loanedBooks = new StudentBookArray();
	
	public Student(String name, String email, String password, StudentCourseArray courses, StudentBookArray loanedBooks) {
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
		return name;	}
	public String getEmail() {
		return email;	}
	public String getPassword() {
		return password;	}
	public StudentCourseArray getCourseArr(){
		return courses;	}
	public StudentBookArray getBookArr(){
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
	
	
	public void editProfile() {//Need to do
		//change name
		
		//change email
		
		//change password
	}
	
	
	public void loan(Book book) {//Need to do***
		book.loan(this);
		loanedBooks.add(book);
	}
	
	
	public String toString() {
		if(!name.equals("Unavailable"))	//student exists
			return "Student name: " + name + "\nStudent email: " + email;
		return "N/A";
	}

}
