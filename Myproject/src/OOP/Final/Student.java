package OOP.Final;

public class Student {

	final int ROLLNo ;
	final  String name ;
	
	// this is the initializer Block we can initialize the fina variable within this block
	// this block is excuted firstly
	{
		ROLLNo = 061;
	//	name ="Sunil";
	}
//	 this is the Static  Block we can initialize the fina variable within this block

	static {
	//	name ="Sunil";
	}
//	 Initialization of the final variable within the Constructor 
	public Student() {
		name = "Sunil";
	}
	int rollno;
	String nam;
	
	//	final Method 
	final public void getdescription() {
		System.out.println(nam+" roll no is "+rollno);
	}
	
	
}
