package OOP.Encapsulation;

public class Student {

	private int age;
	private String name ;
	
//	Autometic Generated getter and Setter Function for any data type Process for this is to 
//	Right click ----> Source----->Generate getter and setter------>Select datatype for which you want to create getter and setter function
//	This function is usually used for restriction
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 20) {
			this.age = age;
		}
		else {
			System.out.println("Your Age is Morethan 20 ,So you cannot get Addmition in the School");
		}
	}
	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		if(name  {
//		this.name = name;
//		}
//		else {
//			System.out.println("The Symbol you type is not valid for the Name");
//		}
//	}
		
}
