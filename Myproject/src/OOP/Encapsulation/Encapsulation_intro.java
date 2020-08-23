package OOP.Encapsulation;

import java.util.Scanner;

public class Encapsulation_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name and age");
		int age =sc.nextInt();
		//String name =sc.nextLine();
		Student s1 =new Student();
		s1.setAge(age);
		
	}

}
