
public class Exception_handleing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int ar[] = new int[5];
		
		try {
			System.out.println(ar[8]);
		
		}catch(ArithmeticException e){
			System.out.println(e.getMessage()+"		Occured");			
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array element Should be in rang");
		
		}catch(IllegalArgumentException e) {
			System.out.println("check your casting ");
	
		}finally {
			System.out.println("This will always Run ");
		}
	

		
//		int a, b;
//		a = 5;
//		b = 0; 
//		try {
//			//   Arithmetic Exception divide by Zero
//			int c = a/b;
//			System.out.println(" C is : "+c);
//	
//		}catch(ArithmeticException e){
//		
//			System.out.println(e.getMessage()+"		Occured");
//				
//		}
//	System.out.println("Very important Code");
		fun1();
		System.out.println("Very important code");
		
	}
	static void fun1() {
		
	}
	
	static void fun3() {
		int a, b;
		a = 5;
		b = 0; 
		try {
			//   Arithmetic Exception divide by Zero
			int c = a/b;
			System.out.println(" C is : "+c);
	
		}catch(ArithmeticException e){
			System.out.println(e.getMessage()+"		Occured");			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array element Should be in rang");
		}catch(IllegalArgumentException e) {
			System.out.println("check your casting ");
		}
		
		
	}

}
