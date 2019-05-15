import java.util.*;

public class Book {
	String name;
	boolean loaned;
	
	public Book(String name, boolean loaned) {
		this.name = name;
		this.loaned = loaned;
	}
	
	public Book(String name) {
		this.name = name;
		loaned = false;
	}
	
	
	public String getName() {
		return name;	}
	public boolean isLoaned() {
		return loaned;	}		
	
	
	public void loan() {
		loaned = true;
	}
	public void voidLoan() {
		loaned = false;	
		checkOutDate = null;
	}
	
	
	
	public String toString() {
		if(loaned)
			return (name + "\n");
		return (name + " is not currenty loaned\n\n");
	}
}
