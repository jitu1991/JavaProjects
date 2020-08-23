package OOP.Inheritance;

public class Teacher extends Person{
	public void teach() {
		System.out.println("Teacher "+name+ " is Teaching" );
	}
	public void walk() {										//Override this function so this method would be executed
		System.out.println("Teacher "+name+" is walking");
	}

}
