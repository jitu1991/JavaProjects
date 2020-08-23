package Exception_handle;

public class Multiple_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Calling the function ");
		fun1();
		fun3();
	}

	
	static void fun1() {
		System.out.println("Inside function 1 with Array Index Out Of Bounds Exception ");
		//fun3();
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
	
	}
	
	static void fun3() {
		System.out.println("Inside function 3 with Arithmetic Exception ");

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
