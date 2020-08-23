package string;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Reverse Of an String Word By By");
		System.out.println("Enter the String");
		String s= sc.nextLine();
		System.out.println(s.length());
		String ans ="";
		int j,i=s.length()-1;
		while( i >= 0) {	
			while(i >= 0 && s.charAt(i)  == ' ') {	
				i--;
				}
			
			j = i;
			if(i<0) break;
			while(i>=0 && s.charAt(i) != ' ') {
				i--;
			
			}
			if( ans.isEmpty())
				ans = ans.concat(s.substring(i+1, j+1));
			else
				ans = ans.concat(" "+s.substring((i+1), (j+1)));
		}
		System.out.println("Reverse of the String is !");
		System.out.println(ans);
	}

}
