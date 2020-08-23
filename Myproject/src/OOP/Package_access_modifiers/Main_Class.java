package OOP.Package_access_modifiers;

import java.util.Scanner;

import OOP.Package_access_modifiers.Model.Student;

public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Student obj =new Student("Anuj");
		 obj.getName();
//		 obj.name ="ram";	//the feild is not visiable for this main Activity because the name String variable is private in the student class
//		 obj.getPassword();	//the Method is not visiable for this main Activity because this method  is private in the student class
		System.out.println(obj.getName());
		System.out.println();
	}

}
