package Exception_handle;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		a = 5;
		b = 0; 
		try {
			//   Arithmetic Exception divide by Zero
			int c = a/b;
			System.out.println(" C is : "+c);
	
		}catch(ArithmeticException e){
		
			System.out.println(e.getMessage()+"		Occured");
				
		}
	System.out.println("Very important Code");
	
	}

}
