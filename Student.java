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
	
		
	public void loan(Book book) {//Need to do***
		book.loan(this);
	}
	
	
	public String toString() {
		if(!name.equals("Unavailable"))	//student exists
			return (name + " " + id + " " + password + "\n");
		return "N/A\n\n";
	}

}
