import java.util.*;

public class Admin {
	private String name, id, password;
	
	public Admin(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	

	public String getName() {
		return name;	}
	public String getid() {
		return id;	}
	public String getPassword() {
		return password;	}

	
	public String toString() {
		return (name + " " + id + password + "\n");
	}

}