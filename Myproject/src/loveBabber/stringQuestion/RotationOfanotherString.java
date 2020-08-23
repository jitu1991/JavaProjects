package loveBabber.stringQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class RotationOfanotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Write a code to check that a string is a rotation of another string 	?
//		Example : S1 - mypencil , s2 - encilmyp (are true)
		Scanner sc = new Scanner(System.in);
		String s1 , s2;
		System.out.println("Enter the first String");
		s1 = sc.nextLine();
		System.out.println("Enter the Second String");
		s2 = sc.nextLine();
//		comparing two string
		System.out.println("equal(s1,s2)");
		String s3 = s1+s1;
//		Solve the problem using function
//		System.out.println(s3);
//		if(s3.contains(s2)) {
//			if(s1.length() == s2.length())
//			System.out.println("True");
//			else {
//				System.out.println("Sub-String is present not rotation");
//			}
//		}else {
//			System.out.println("False");
//		}
	}
}
	
//	public static int equal(String s1 , String s2) {
//		int t = Math.min(s1.length(), s2.length());
//	 {
//		for(int i=0; i<t;i++) {
//			int ch1 = (int) s1.charAt(i);
//			int ch2 = (int) s2.charAt(i);
//			if(ch1 != ch2) return ch1-ch2;
//		}
//		if(s1.length() != s2.length()) {
//			return s1.length() - s2.length();
//		}
//		else {
//			return 0;
//		}
//	 }
//	
//
//
////	public static boolean rotation(String s , String st) {
////		int l = 0;
////		String news1;
////		if(l<s.length()) {
////				if( s == st) {
////				return true;
////			}
////	//		convert a string into a characterArray
////			char[] ch = s.toCharArray();
////			char first = ch[0];
////			for(int i=0 ; i<s.length()-1; i++) {
////				ch[i] = ch[i+1];
////			}
////			ch[s.length()-1] = first;
////	//		Convert back a character Array into a String
////			news1 = Arrays.toString(ch);
////			System.out.println("Sunil");
////			
////			return (rotation(news1 ,st));
////		}
////		else return false;
////	}
//	
//
