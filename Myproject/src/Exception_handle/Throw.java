package Exception_handle;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		fun1();
		fun2();
		System.out.println("Very important Code");
		
	
	}
	static void fun1() {
	
		int a, b;
		a = 5;
		b = 0; 
		int c = a/b;		
		System.out.println(" C is : "+c);
		try {
		fun2();
		}catch(Exception e) {
			System.out.println(e.getMessage()+"		 Occured"); 
			
		}
		System.out.println("Very important Code");

		
	}
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isdanger =true;
		if(isdanger) {
			throw new ArrayIndexOutOfBoundsException(" Danger was coming");
		}
		
	}

	


}
