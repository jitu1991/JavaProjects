package OOP.Interface;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person obj =  new Person();
		obj.study();
		obj.make_vidio();
//Object of the interfance cannot be created 		
	//	Youtuber y1 = new Youtuber();
		
// By this way we can Access the Youtuber's function
		Youtuber obj1 = obj;
		obj1.editvidio();
		obj1.make_vidio();
		

	}
	
	

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Person is Studying");
		
	}

	@Override
	public void make_vidio() {
		// TODO Auto-generated method stub
		System.out.println("Person is making a good Vidio");
		
	}

	@Override
	public void marks() {
		// TODO Auto-generated method stub
		System.out.println("Good Marks");
		
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void editvidio() {
		// TODO Auto-generated method stub
		System.out.println("Vidio is being edited ");  
		
	}

}
