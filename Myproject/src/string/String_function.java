package string;

import java.util.Scanner;

public class String_function {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = "Sunil Jaiswal";
		String gmssss;
		String name2 ="		Sunil		";
		String another_Name = new String ("Sunil Jaiswal");
		String another_Name2 = new String ("Aman");
//		
//		System.out.println(name);
//		System.out.println(another_Name);
//		//System.out.println(another_Name==name);
		System.out.println(another_Name==another_Name2);
//		System.out.println(name==name2);
		System.out.println("Enter the string");
	//	gmssss = sc.nextString();
		for(int i=0; i<=name.length(); i++) {
			System.out.println(name.charAt(i));		/* getting  string's character at defined position .charAt() function*/
		}
		
//		System.out.println(name.length());		/* getting  string's  length 	.length() function*/
//		System.out.println(name.substring(6));	/* Getting substring by providing starting index position of the string */
//		System.out.println(name.substring(4, 10)); /* Getting specific substring  by providing  begging to ending length */
///*same*/System.out.println(name.contains("Jaiswal")); /*Checking that string contain or not */
///*same*/System.out.println(name.contains("kumar")); /*Checking that string contain or not */
//		System.out.println(name.contentEquals(another_Name));
//		System.out.println(name2.isEmpty());
//		//name2	=	name2+" Sharma";
//		System.out.println(name2.concat(" kumar"));
//		System.out.println(another_Name.replace('S','T'));	/* Replace a character */
//		System.out.println(another_Name.replace("Sunil","Tanu")); /*Replace An string	*/
//		
//		//String[] split;
//			String cars= "Hyundia,Maruti,Swift,Jaagvar,Scorpio,Maruti 800";
//			String allcars[] = cars.split(",");
//			for(String car: allcars) {
//				System.out.println(car);
//			}
////			for(int i=1;i<=allcars.length;i++) {
////				System.out.println(cars);
////			}
//			System.out.println(cars.indexOf('M'));
//			System.out.println(cars.toLowerCase());
//			System.out.println(cars.toUpperCase());
//			System.out.println(name2.trim()+"  "+name2.trim()+" "+name.trim());
	}

}
