package Data_Structure.List_Interface.Vector_Stack;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalancingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String which contain  only these character '(,{,[,],},)");
		String s = sc.nextLine();
		boolean isbalance = true;
		Stack<Character> bracket = new Stack<>();
		char character;
		for( int i = 0; i < s.length();i++) {
			 character = s.charAt(i);
			if( character == '{' || character == '[' || character == '(' ) {
				bracket.push( character );
				continue;
			}
			if( character == '}') {
				if( bracket.peek() == '{') {
					bracket.pop();
				}
				else{
					isbalance = false;
//					break;
					continue;
				}
			}
			if( character == ']') {
				if( bracket.peek() == '[') {
					bracket.pop();	
				}
				else{
					isbalance = false;
//					break;
					continue;
				}
			}	
			if( character == ')') {
				if( bracket.peek() == '(') {
					bracket.pop();
				}
				else{
					isbalance = false;
//					break;
					continue;
				}
			}


		}
		if( isbalance ) {
			System.out.println("Balanced");
		}else
			System.out.println("Not Baanced");
		
	}


	}


