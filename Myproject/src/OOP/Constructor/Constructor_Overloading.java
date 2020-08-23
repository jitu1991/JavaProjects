package OOP.Constructor;

import java.util.Scanner;

//	Constructor 
	class Vehical{
		int head_light=2,wheel;
		String color,name;
		
		Vehical(String name){				//constructor 
			this.name=name;
		}
		Vehical(int wheel,String color,String name){	//constructor 1
			this.wheel = wheel;
			this.color=color;
			this.name=name;
		}
	}


public class Constructor_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name of the Vehicle");
		String name =sc.nextLine();
		Vehical(name);
		Vehical bike= new Vehical(2,"White","Apache");
		Vehical Auto= new Vehical(3,"Yellow","E-Rikshaw");
		Vehical car= new Vehical(4,"Black","Audi");
		
		System.out.println("The name of the Showroom is "+name);
		System.out.println(bike.name+" Bike of "+bike.color+" Color has "+bike.wheel+" Wheels With ");
		System.out.println(Auto.name+" Auto of "+Auto.color+" Color has "+Auto.wheel+" Wheels With ");
		System.out.println(car.name+" Car of "+car.color+" Color has "+car.wheel+" Wheels With ");
	}

	private static void Vehical(String name) {
		// TODO Auto-generated method stub
		
	}

}
