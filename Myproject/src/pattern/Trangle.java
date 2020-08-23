package pattern;

import java.util.Scanner;

public class Trangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of row");
		int r=sc.nextInt();
		System.out.println(" This is the First Pattern");
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* " );
			}
			System.out.println();
		}
		System.out.println("This is the second Pattern");
		
		for(int i=1;i<=r;i++) {
			for(int k=1;k<=r-i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* " );
			}
			System.out.println();
		}
		System.out.println("This is the Third Pattern");
		int v=1;
		for(int i=1;i<=r;i++) {
			for(int k=1;k<=r-i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(v+" "  );
				v++;
			}
			for(int l=2;l<=i;l++) {
				System.out.print( v+" ");
				v++;
			}
			System.out.println();
			v=1;
		}
				
	}

}
