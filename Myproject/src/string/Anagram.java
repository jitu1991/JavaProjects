package string;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		String s,c;
		boolean is_anagram = false;
		int i,count=0;
		System.out.println("Enter the First String");
		s = sc.nextLine();
		System.out.println("Enter the Second String");
		c = sc.nextLine();
		boolean visited[] = new boolean[c.length()];/*boolean type array to checking repeation */
		if(s.length() == c.length()) {	/* Checking the no of character in both string */
			for(i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				is_anagram= false;
				for(int j =0;j<c.length();j++) {
					if(ch == c.charAt(j) && !visited[j]) {
						visited[j] = true;
						is_anagram = true;
						break;
					}
					
				}
				if(!is_anagram) {
					break;
				}
			}
			
		}
		if(is_anagram)
			System.out.println(" Anagram ");
		else
			System.out.println("Not Anagram");
//		else
//			System.out.println("Both String are not anagram because no of character in both string are no smae  ");
//			
//		System.out.println("Length of the String "+s.length());
//		String hi[]=s.split(" ");
//		for(String yeshvi:hi)
//		System.out.println(yeshvi);
	}

}
