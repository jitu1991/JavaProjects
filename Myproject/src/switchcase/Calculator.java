package switchcase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		//System.out.println("ENTER THE OPERATION");
		System.out.println("1 FOR ADDITION ");
		System.out.println("2 FOR SUBTRACTION ");
		System.out.println("3 FOR MULTIPLICATION");
		System.out.println("4 FOR DIVISION");
		int c;
		do {
		System.out.println("ENTER THE FIRST NUMBER  ");
		int a = sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int b = sc.nextInt();
		int n;
			do {
				
			System.out.println("ENTER THE OPPERATION");
			 int flage= sc.nextInt();
			 int result =0;
			switch(flage) {
				case 1 :{
					result=a+b;
					//int c;
					//c=a+b;
					//System.out.println("ADDITION OF "+a+" AND "+b+" IS " +c+" ");
				    break;
					}
				case 2 :{
					result=a-b;
	//				int c;
	//				c=a-b;
	//				System.out.println("SUBTRACTION OF " +a+" AND "+b+" IS "+c+" " );
					break;
		     		}
				case 3 :{
					result=a*b;
	//				int c;
	//				c=a*b;
	//				System.out.println("MULTIPLICATION OF "+a+" AND "+b+" IS "+c+" ");
					break;
					}
				case 4 :{
					result=a/b;
	//				float c;
	//				c=a/b;
	//				System.out.println("DIVISION OF "+a+" AND "+b+" IS "+c+" ");
					break;
					}
				default :
				{
					System.out.println("YOU DON'T WANT TO PERFORM ANY OPERATION");
					break;
				}
			}
			System.out.println("Result is "+result);
			System.out.println(" if you want to perform the operation with same number then Press 5 ");
			n = sc.nextInt();
			}while(n==5);
			System.out.println("If you want to perform the operation with other number then press 6");
			c = sc.nextInt();
		}while(c==6);
		
	}  

}
