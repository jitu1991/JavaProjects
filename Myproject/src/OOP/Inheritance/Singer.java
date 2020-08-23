package OOP.Inheritance;

public class Singer extends Person {	//Inherit the the person class

	public void sing() {
		System.out.println("Singer "+name+"is singing");
	}
	public void walk() {
		System.out.println("Singer "+name+" is walking");		//Override this function so this method would be executed
	}
}
