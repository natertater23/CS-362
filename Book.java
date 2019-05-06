import java.util.*;

public class Book {
	String name, isbn;
	boolean loaned;
	Date checkOutDate, dueDate;
	
	public Book(String name, String isbn, boolean loaned, Date COD, Date DD) {
		this.name = name;
		this.isbn = isbn;
		this.loaned = loaned;
		this.checkOutDate  = COD;
		this.dueDate = DD;
	}
	
	public Book(String name, String isbn) {
		this.name = name;
		this.isbn = isbn;
		loaned = false;
	}
	
	
	public String getName() {
		return name;	}
	public String getisbn() {
		return isbn;	}
	public boolean isLoaned() {
		return loaned;	}		
	public Date getCheckOutDate() {
		return checkOutDate;	}
	public Date getDueDate() {
		return dueDate;	}
	
	
	public void loan(Date date) {
		loaned = true;	
		checkOutDate = date;
		dueDate = new Date();//need to change
	}
	public void voidLoan() {
		loaned = false;	
		checkOutDate = null;
		dueDate = null;
	}
	
	
	
	public String toString() {
		if(loaned)
			return (name + " was loaned on " + checkOutDate.toString() + " and is due by " + dueDate.toString());
		return (name + " is not currenty loaned");
	}
}
