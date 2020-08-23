package OOP.Package_access_modifiers.Model;

public class Teacher {
	public static void main(String[] args) {
		Student obj =new Student("Suil");
//		obj.name ="sunil";							// feild is not visiable because of private string
		obj.getName();
		
		System.out.println(obj.getName());
	}

}
