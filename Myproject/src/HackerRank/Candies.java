package HackerRank;


import java.util.Arrays;
import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			System.out.println("Gready Algorithem");
			System.out.println("Enter the Number of Eement in the Array");
			int no = sc.nextInt();
			System.out.println("Enter "+no+ " Array Element");
			int A[] = new int[no];
			
			for( int i = 0; i < no; i++ ) {
				A[i] = sc.nextInt();				
			}
			
			Tatal_candies(A , no);
			
// Solve the problem without using function 
		
//			for( int i = 0; i < n; i++ ) {
//				Arr[i] = sc.nextInt();				
//			}
//			int c[] = new int[n];
//			Arrays.fill(c, 1);
//			
//			for(int i = 1; i < n ;i++) {
//				if(Arr[i] > Arr[i-1]) {
//					c[i] = c[i-1]+1;
//				}
//			}
//			for(int i = n-2; i >= 0 ;i--) {
//				if(Arr[i] > Arr[i+1]) {
//					c[i] = Math.max(c[i+1]+1 , c[i]);
//				}
//			}
//			System.out.print("ARRAY		");
//			for( int i = 0; i < n; i++ ) {
//			System.out.print(Arr[i] +"	");				
//			}
//			System.out.println();
//	
//			System.out.print("Candies		");
//			for(int i = 0; i < n ;i++) {
//			System.out.print(c[i]+"	");
//			}
//
			
	}
	public static void Tatal_candies(int Arr[],int  n) {
		
		int c[] = new int[n];
		Arrays.fill(c, 1);
		
		for(int i = 1; i < n ;i++) {
			if(Arr[i] > Arr[i-1]) {
				c[i] = c[i-1]+1;
			}
		}
		for(int i = n-2; i >= 0 ;i--) {
			if(Arr[i] > Arr[i+1]) {
				c[i] = Math.max(c[i+1]+1 , c[i]);
			}
		}
		long sum = 0;
		for(int i =0; i<n;i++) {
			sum+= c[i];
		}
		
		System.out.println("Tatal Number of candies required is :"+sum);
		
		
	}
	

}
