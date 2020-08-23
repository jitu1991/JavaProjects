package OOP.Final;

public class final_keyword extends Student{
	final   long  ROLLNO =190061 ;	// we have to initialize global variable  like this  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final  String name  ;//	Local variable can be initialize before the use 
		name  = "Sunil";
		System.out.println(name);
		
		final Student obj = new Student();

		Student obj1 = new Student();
	//	obj = obj1;	// here the obj has  reference of the obj1 when we don't make the final object
		
		obj1.nam ="Sunil";	// Whereever we can change the value of the non final variable of the final object
		obj1.rollno=61;
		obj1.getdescription();
	}
	// we cannot override the same method  when we make that final
//	public void getdescription() {
//		System.out.println("Imside MAin function");
//	}

}
