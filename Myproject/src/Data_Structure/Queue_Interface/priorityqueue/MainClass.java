package Data_Structure.Queue_Interface.priorityqueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	
		System.out.println("Program to find top 3 Number");
		System.out.println("Enter the number of Element");
		int n = sc.nextInt();
		System.out.println("Enter the number of top Element ");
		int t =sc.nextInt();
		System.out.println("Element are "+n);
		if(n > t) {
			int a[] = new int[n];
			for(int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0 ; i<t; i++) {
				pq.add(a[i]);
			}
			for(int i = t; i<n; i++) {
				if(pq.peek() < a[i]) {
					pq.remove();
					pq.add(a[i]);
								}
			}
			System.out.print("[");
			for(int i=0; i<n; i++) {
				System.out.print(a[i]+", ");
			}
			System.out.println("]");
			System.out.print("Top "+t+ " element are :");
			System.out.print(pq);
		}
		else {
			System.out.println("Array Element are not enough");
		}

	}


	

}
