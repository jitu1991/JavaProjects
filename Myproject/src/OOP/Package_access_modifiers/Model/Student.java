package OOP.Package_access_modifiers.Model;

public class Student {
	
	private String name;
	public Student(String name){
		this.name =name;
	}
	public String getName() {
		return name;
	}
	
	
	// The accessability of this method is restricted within this class
	private String getPassword() {
		return name;
	}
	

}
