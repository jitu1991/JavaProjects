package Array;

import java.util.Scanner;

public class Selection_Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("This is the Selection Sorting");
		System.out.println("Enter the number of Element");
		int n = sc.nextInt();
		int Sort[]= new int[n];
		System.out.println("Enter "+n+" Element of the Array");
		for(i=0;i<n;i++) {
			Sort[i]=sc.nextInt();
			}
		for(i=0;i< n;i++) {
			System.out.print(Sort[i]+" ");
			}
		for(i=0;i< n-1;i++) {
			int mid=i;
//		this is for picking up the smallest element from the arraY
			for(int j=i+1;j< n;j++) {
				if(Sort[mid] > Sort[j]) {
					mid = j;
					}
				}
			int temp;
			temp = Sort[i];
			Sort[i] = Sort[mid];
			Sort[mid] = temp;
			}
		System.out.println();
		System.out.println("This Array is Sorted Using Selection Sorting");
		for(i=0;i< n;i++) {
			System.out.print(Sort[i]+" ");
			}

	}

}
