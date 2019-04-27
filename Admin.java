import java.util.*;

public class Admin {
	private String name, email, password;
	
	public Student(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
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
	
	public void addCourse(Course course) {
		//will need an array to add to
	}
	
	public void removeCourse(Course course) {
		course = null; //will need an array to remove from
	}
	
	public void activateCourse() {
		
	}
	
	public void deactivateCourse() {
		
	}

}