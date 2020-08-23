package OOP.Constructor;

import java.util.Scanner;

class human{					/*	Constructor	*/
	int leg,eye,hand;
	String breed ="Homosepisn",name;
	human(String name){
		leg =4;
		eye =2;
		hand =2;
		this.name =name;
	}
	public void description() {
		System.out.println("Human have "+leg+" legs and "+hand+" hand and "+eye+" Eye of "+breed+" Breed");
	}
	public void eat() {
		System.out.println(name+" can eat");
	}
	public void walk() {
		System.out.println(name+" can walk");
		
	}
	public void read() {
		System.out.println(name+" can read");
		
	}
}

public class Constructor_Intro {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("NAme of the female");
		String y =sc.nextLine();
		System.out.println("name of the male");
		String s =sc.nextLine();
		human female =new human(y);
		human male =new human(s);
		female.description();
		male.description();
		female.read();
		male.read();
	}

}
