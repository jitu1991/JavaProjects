package Array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s;
		do {	
			System.out.println("Enter the Number of Row of First Array");
			int Fr = sc.nextInt();
			System.out.println("Enter the Number of Columns of First Array");
			int Fc = sc.nextInt();
			int firstarray[][]= new int [Fr][Fc];
		
			System.out.print("First Array");
			for (int i = 0; i < Fr; i++) {
				for (int j = 0; j < Fc; j++) {
					firstarray[i][j]=sc.nextInt();
				}
				//System.out.println();
			}
			for (int i = 0; i < Fr; i++) {
				for (int j = 0; j < Fc; j++) {
					System.out.print(firstarray[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Enter the Number of Row of Second Array");
			int Sr = sc.nextInt();
			System.out.println("Enter the Number of Columns of Second Array");
			int Sc = sc.nextInt();
			int Secondarray[][]= new int[Sr][Sc];
			
			System.out.println("Second Array");
			for (int i = 0; i < Sr; i++) {
				for (int j = 0; j < Sc; j++) {
					Secondarray[i][j]= sc.nextInt();
				}
				System.out.println();
			}
			for (int i = 0; i < Sr; i++) {
				for (int j = 0; j < Sc; j++) {
					System.out.print(Secondarray[i][j] + " ");
				}
				System.out.println();
			}
			do {
				
				System.out.println("Enter the Opperation");
				int opp = sc.nextInt();
				switch(opp)
				{
				case 1 :
						{
							if(Fr==Sr && Fc==Sc) 
							{
								
							int R[][]= new int[Fr][Fc];
							System.out.println("sum of the Array");
							for(int i=0;i<=Fr-1;i++) {
								for(int j=0;j<=Fc-1;j++) {
									R[i][j]=firstarray[i][j]+Secondarray[i][j];
								}
							}
							for (int i=0;i<=Fr-1; i++) {
								for (int j=0;j<=Fc-1;j++) {
									System.out.print(R[i][j] + " ");
								}
								System.out.println();
							}
							
							}
							else {
								System.out.println("Sum of the Array is not possible");
								}
							break;
						}
				case 2 :
						{
							if(Fr==Sr && Fc==Sc) 
							{
								
							int R[][]= new int[Fr][Fc];
							System.out.println("subtraction of the Array");
							for(int i=0;i<=Fr-1;i++) {
								for(int j=0;j<=Fc-1;j++) {
									R[i][j]=firstarray[i][j]-Secondarray[i][j];
								}
							}
							for (int i=0;i<=Fr-1; i++) {
								for (int j=0;j<=Fc-1;j++) {
									System.out.print(R[i][j] + " ");
								}
								System.out.println();
							}
							
							}
							else {
								System.out.println("Subtraction of the Array is not possible");
								}
							break;
						}
				case 3 :
						{int R[][] = new int[Fr][Sc];
								if(Fc==Sr) {
								System.out.println("Multiplication of the Array with Dimention  "+Fr+" * "+Sc);
									for(int i=0; i<=Fr-1 ;i++) {
									for(int j=0; j<=Sc-1 ;j++){
										int sum =0;
										for(int k=0; k<=Fc-1; k++){
											sum = sum + firstarray[i][k] * Secondarray[k][j];
										}
										R[i][j] = sum;
									}
									System.out.println();
								}
								for(int i=0; i<=Fr-1; i++) {
									for(int j=0; j<=Sc-1; j++) {
										System.out.print(R[i][j]+" ");
									}
									System.out.println();
								}
							}
							else
								System.out.println("Multiplication of the Array is not possible");
						break;
						}
				case 4 :
						{
					System.out.println("Work under process");
						break;
						}
				default :
					
					System.out.println("You have entered wrong opperation");
						break;
						}
				System.out.println("Press 1 for continue with the same array");
				s = sc.nextInt();
			}while(s==1);	
		System.out.println("Press 2 for perform opperation with different array");
		s= sc.nextInt();
		}while(s==2);			
					
	}	
}
