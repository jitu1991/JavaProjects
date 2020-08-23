package OOP.Method;

import java.util.Scanner;

public class Method {
//	int hcf;
// method to find maximum number	
	static int max_of(int a, int b,int c) {	/* 	minimum method*/
		if(a>b) 
			if(a>c)
				return a;
			else 
				return c;
		else {
			if(b>c)
				return b;
			else
				return c;
		}
	}
//	Method to find minimum number
	static int min_of(int a, int b) {	/* 	minimum method*/
		if(a<b) 
			return a;
		else
			return b;
	}
//Method to find hcf 
	 static int hcf(int a, int b) {	/*	hcf method*/
		int min = min_of(a,b);
		int hcf =1;
		for(int i=1; i<=min; i++) {
			if( a%i == 0 && b%i == 0) {
				hcf = i;
			}
		}
		return hcf;
	}
//	Mathod to find lcm
	 static int lcm(int a,int b,int c) {
		 int max = max_of(a,b,c);
		 int lcm=1;
		boolean i=true;
		 while(i) {
			 if( max%a ==0 && max%b ==0 && max%c ==0) {
				lcm = max;
				 break; 
			 }
			 max+=max;
		 }
		 return lcm;
	 }
	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two number find maximum Number");
		int x,y;
		y = sc.nextInt();
		x=sc.nextInt();
		System.out.println("Minimum number between "+y+" And "+x+" is :"+min_of(x,y));
		System.out.println("HCF Between "+x+" And "+y+" is :"+hcf(x,y) );
		System.out.println("Enter third number");
		int z =  sc.nextInt();
		System.out.println("Maximum Number between "+x+" and "+y+" and "+z+" is : "+max_of(x,y,z));
		System.out.println("LCM Between "+x+" And "+y+" "+z+" is : "+lcm(x,y,z));
	}

}
