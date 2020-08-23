package OOP.Inheritance;

import java.util.Scanner;

public class Inheritance_Intro {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name of Teacher ");
		String tname =sc.nextLine();
		
		Person p =new Person();
		
		Teacher t1 =new Teacher();
		t1.name = tname;
		t1.eat();
		t1.walk();
		t1.teach();
		System.out.println();
		System.out.println("Enter the name of Singer ");
		String sname =sc.nextLine();
	
		Singer s1 =new Singer();
		s1.name = sname;
		s1.eat();
		s1.walk();
		s1.sing();
	}

}
