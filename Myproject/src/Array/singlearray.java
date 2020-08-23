package Array;

import java.util.Scanner;

import javax.swing.Spring;

public class singlearray {
	
	public static void main(Spring[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Element in the Array");
		int n =sc.nextInt();
		int Array[]=new int[n];
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum+=Array[i];
			
		}
		System.out.println("Sum of the Array "+sum+" ");
	}

}
