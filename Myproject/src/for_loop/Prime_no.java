package for_loop;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int c;
//	do {
//		int n ,i,count=0;
//		System.out.println("Enter the number");
//		n =sc.nextInt();
//		for(i=2; i<=n/2; i++) {
//			if(n%i == 0) {
//				count=1;
//			break;
//			}
//		}
//		if( count == 1)
//			System.out.println(+n+" is not a Prime Number");
//		else {
//			System.out.println(+n+"is a prime number");
//		}
//		System.out.println("Press 1 for continue");
//		c= sc. nextInt();
//	}while(c==1);

	Scanner sc = new Scanner(System.in);
	int c;
	do {
		int n,e ,i,flage,p=0;
		System.out.println("Enter the  starting number");
		n =sc.nextInt();
		int temp=n;
		System.out.println("Enter the ending number");
		e =sc.nextInt();
		while(n<e){
			flage=0;
			for(i=2; i<=n/2; i++) {
				if(n%i == 0) {
					flage=1;
				break;
				}
			}
			if( flage == 0) {
				p++;
 				System.out.println(+n+"  ");
			}
			++n;
	
		}
		System.out.println("Between "+temp+" and "+e+" "+p+" Prime number is present");
		System.out.println("Press 1 for continue");
		c = sc.nextInt();
	}while(c==1);

}
}