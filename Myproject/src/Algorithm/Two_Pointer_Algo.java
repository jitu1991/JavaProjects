package Algorithm;

import java.util.Scanner;

public class Two_Pointer_Algo {

	public static void main(String[] args) {
		int n;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of element of the Array");
		n = sc.nextInt();
		int Arr[] = new int[n];
		System.out.println("Enter the Array Element");
		for(int  i =0; i < n; i++) {
			Arr[i] = sc.nextInt();
			
		}
		//	non_efficient e = new non_efficient();
		//	e.two_point(Arr, n);
			efficient  t = new efficient();
			t.two_point(Arr, n);
		
		
		
		
	}
	static class efficient{
		public void two_point(int Arr[], int n) {
			
//			for( int i = 0; i< n-2; i++) {
//				if(sum(Arr, Arr[i], i+1)) {
//					System.out.println("yes triplet with Zero");
//				//.out.println("No 1 "+Arr[i]+" No 2 "+Arr[j] + "No 3 "+ Arr[k] );
//			
//				}
//				else
//					System.out.println("not Triplet");
//				
//			}
//			
		}
//		public boolean sum(int a[], int x, int i) {
//			int j = a.length-1;
//			while(i < j) {
//				if (a [i] + a[j] > x) {
//					j++;
//				}
//				else if(a[i] + a[j] < x){
//					i++;
//				}
//				else 
//					return true;
//		
//			}
//		//	return false;
//		
//		}
	}
	
	static class non_efficient{
		public void two_point(int Arr[],int n){
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n-1; j++) {
					for(int k = j+1; k < n-2; k++) {
						if(Arr[j] + Arr[k] -Arr[i] == 0) {
							System.out.println("yes triplet with Zero");
							System.out.println("No 1 "+Arr[i]+" No 2 "+Arr[j] + "No 3 "+ Arr[k] );
							
						}
						else {
							System.out.println("Not Triplet");
						}
					}
						
				}
				
			}
		}
	}

}
