package Array;

import java.util.Scanner;

public class linear_search {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int i,a,b;
		do	/* linear shorting in the array */
		{
				System.out.println("Enter the number of element is the array list");
				int n =sc.nextInt();
				int linear[] = new int[n];
				System.out.println("Enter "+n+" Element of the Array");
				for( i=0;i<=n-1;i++) {
					linear[i]=sc.nextInt();
				}
				System.out.println("This is  your Array");
				for( i=0;i<=n-1;i++) {
					System.out.print(linear[i]+"  ");
				}
				System.out.println();
				System.out.println("Enter the element which you want to search in the Array list");
				int s=sc.nextInt();
				
				for( i=0;i<=n-1;i++) {
					//searching of the array element
						if(linear[i]==s) {
							System.out.println("Element "+s+" is found at location "+(i+1));	
								break;
								}
						
						if(i==n-1) {	/* Searching element is not found	*/
							System.out.println(+s+" is not found in array");
						}
				}
				System.out.println("PRESS 1 FOR CONTINUE WITH LINEAR SHORTING");
				a=sc.nextInt();
				}while(a==1);
//	work with multidimentation array
//		System.out.println("Enter the number of row of multidimention Array");
//		int r=sc.nextInt();
//		System.out.println("Enter  the number of column if multidimentation Array");
//		int c=sc.nextInt();
//		int binary_multi[][] =new int[r][c];
//		System.out.println("Enter the element");
//		
//		for(i=0;i<=r-1;i++) {
//			for( int j=0;j<=c-1;j++) {
//				binary_multi[i][j]=sc.nextInt();
//			}
//		}
//		for(i=0;i<=r-1;i++) {
//			for( int j=0;j<=c-1;j++) {
//				System.out.print(binary_multi[i][j]);
//			}
//		}
//		
//		
//		for(i=0;i<=r-1;i++) {
//		//	for(int j=0;j<=c-1;j++) {
//				for(int k=0;k<=c-1;k++) {
//					if(binary_multi[i][k]<binary_multi[i][k+1]) {
//						int temp;
//						temp=binary_multi[i][k];
//						binary_multi[i][k] = binary_multi[i][k+1];
//						binary_multi[i][k+1] = temp;
//					}
//				}
//			//}	
//		}
//		for(i=0;i<=r-1;i++) {
//			//for(int j=0;j<=c-1;j++) {
//				for(int k=0;k<=c-1;k++) {
//					System.out.print(binary_multi[i][k]);
//					}
//				//}
//			}	
//		
	}
} 
