package OOP;

import java.util.Scanner;

class Cat{
		boolean hasfur;
		String color,bread;
		int leg,eyes;
//	// This is non parameterized Constructor	 
//		Cat(){			/* Constructor is defining*/
//			leg = 4;	/*	 fixing the leg 4 for all object of cat class*/
//			eyes =2;	/*	these can be accepted from the user also */
//		}
////		This is a Parameterized Constructor
//		Cat(int x,int y, String s){
//			leg =x;
//			eyes =y;
//			color =s;
//			this.bread  ="Danger";
	//	}
		public void description() {
			System.out.println("My cat has "+leg+" legs and "+eyes+" eyes and "+color+" Color and its bread is "+bread);
		}
		public void walk() {
			System.out.println("The cat is walking");
		}
		public void eat() {
			System.out.println("The cat is eating");
			
		}
	}
	public class oop_Intro{
		public static void main(String[] arg) {
			Scanner ic = new Scanner(System.in);
			String s;
			System.out.println("Concept of OOP( Object Oriented Programing Language");
			System.out.println("PArts of OOPs\n1 Object\n2 class\n3 Interitane\n4 Polimorphism\n5 Abstraction\n6 Encapsulstion\n ");
			
			Cat cat1 = new Cat(); /*	Object declaration  of cat class and multiple object can be created*/
			cat1.description();
			cat1.leg =4;
			cat1.eyes =2;
			cat1.color="Black";
			cat1.bread ="Danger";
			cat1.description();
			cat1.walk();
			cat1.eat();
			System.out.println();
//			System.out.println("Enter legs and eyes and color of cat2");
//			int l=ic.nextInt();
//			int e=ic.nextInt();
//			System.out.println("Enter the String");
//			s =ic.nextLine();
			Cat cat2 =new Cat();
			cat2.description();
			cat2.leg=3;
			cat2.eyes =2;
			cat2.color ="white";
			cat2.bread ="Cute";
			cat2.description();
			cat2.walk();
			cat2.eat();
					
			
		}
	}