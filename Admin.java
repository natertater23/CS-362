import java.util.*;

public class Admin {
	private String name, email, password;
	//undecided if id will be used
	
	public Admin(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	

	public String getName() {
		return name;	}
	public String getEmail() {
		return email;	}
	public String getPassword() {
		return password;	}
	
	
	public void editProfile() {//Need to do
		//change name
		
		//change email
		
		//change password
	}
	
	
	public void activateCourse(Course course) {
		course.activate();	}
	public void deactivateCourse(Course course) {
		course.deactivate();	}
	

}
