package OOP.Encapsulation;

import OOP.Encapsulation.Static_c.*;

public class Static_keyword {

	public static void main(String[] args) {
	
	Static_c objs =new Static_c();
	A obja = objs.new A();	// This is the inner class so we have to import static_c class 
//We have make this b class is static so we can simply create the object of b class
// Because we have make this class Static
	B objb = new B();
//	C objc = objs. new C();
	}
//	THESE are the static blocks which is excuted before the main class

static {
	System.out.println("block 1");
}
static {
	System.out.println("block 2");
}
}
