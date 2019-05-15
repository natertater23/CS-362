import java.util.*;

public class Book {
	boolean loaned;
	String name;
	Student student;
	String checkOutDate, dueDate;
	
	public Book(boolean loaned, Student student, String COD, String DD) {
		this.student = student;
		this.loaned = loaned;
		this.checkOutDate  = COD;
		this.dueDate = DD;
	}
	public Book(String name) {
		this.name = name;
	}
	public Book() {
		loaned = false;
		student = null;
		checkOutDate = "N/A";
		dueDate = "N/A";
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isLoaned() {
		return loaned;	}
	
	public Student getStudent() {
		return student;	}
		
	public String getCheckOutDate() {
		return checkOutDate;	}
	
	public String getDueDate() {
		return dueDate;	}
	
	
	public void loan(Student stu) {
		loaned = true;	
		student = stu;
	}
	
	public void voidLoan() {
		loaned = false;	
		student = null;
	}
	
	public String toString() {
		
			return (name );
	}
	
}
