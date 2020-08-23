package OOP.Polymorphism;

import java.util.Arrays;

public class Polymorphism {

	public static void main(String[] args) {
		
//		String mystring = "Maarti and Audi and Jaquar and Fortuner";
//		String[ ] Splitstring = mystring.split(" and ");
//		System.out.println(Arrays.toString(Splitstring)); 
//
//		System.out.println("Length of the Array is :"+Splitstring.length);
		
		
		Animals A1 =new Animals();
		Pet p1 = new Pet();
		Dog D1 = new Dog();
		
	//	A1.description();
		//p1.description();
		p1.eat();
		p1.walk();
	//	D1.description();
		D1.walk();
		D1.eat();
		System.out.println("");

		Pet p =D1;
		Animals a = D1;
		p.walk();
		
		((Pet) a).walk();	/* 	 	Casting animals into Pet	*/
	}

}
