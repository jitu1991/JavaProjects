package Array;

import java.util.Scanner;

public class binary_serching {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,b;
		do {
			System.out.println("Enter the number of element is the array list");
			int n =sc.nextInt();
			int linear[] = new int[n];
			System.out.println("Enter "+n+" Element in the Array");
			for( i=0;i<=n-1;i++) {
				linear[i]=sc.nextInt();
			}
			System.out.println("This is  your Array");
			for( i=0;i<=n-1;i++) {
				System.out.print(linear[i]+"  ");
			}
			System.out.println();
			for(i=0;i<=n-2;i++) {/*	in comparision the loop will run less 2 time in array*/ 
					if(linear[i]>linear[i+1]) {
						System.out.println("This Array is not Sorted");
							break;
							}
			}
			
			System.out.println("Now This is the Shorted array");
			
			for(int j=0;j<=n-2;j++) {
				//	This is only for one row
					for( i=0;i<=n-2;i++) {
						if(linear[i]>linear[i+1]) {
							int temp;
							temp=linear[i];
							linear[i]=linear[i+1];
							linear[i+1]=temp;
						}
					}
				}
			for(i=0;i<=n-1;i++) {
				System.out.print(linear[i]+"  ");
			}
			System.out.println();
			System.out.println("Enter the element which you want to search in the Array list");
			int num=sc.nextInt();
			int l=0,u=n-1,mid;
// Binary searching
			while(l<=u) {	
				mid=l+(u-l/2);			/*	calculate mid element of the array*/
				if(num == linear[mid]) {
					System.out.println("Element "+num+" is found at location "+(mid+1));
					break;
					}
				else if(num < linear[mid]) {
					u=mid-1;
					}
				else if(num > linear[mid]) {
					l=mid+1;
					}
			}
			System.out.println("Element "+num+" is not Present in the Array list");
			
			System.out.println("Press 2 for continue");
			 b=sc.nextInt();
	}while(b==2);
	


	}

}
