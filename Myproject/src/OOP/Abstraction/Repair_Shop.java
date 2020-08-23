package OOP.Abstraction;

public class Repair_Shop {
	
	public static void repair_shop( Car car) {			//
		System.out.println(" Car is repaired ");
	}
	
	
//	public static void repair_shop( Audi car) {			IN THIS CASE WE HAVE TO CREATE MULTIPLE STTIE FUNCTION FOR DIFFERENT TYPES OF THE CAR
//		System.out.println(" Car is repaired ");
//	}
//	public static void repair_shop(  car) {
//		System.out.println(" Car is repaired ");
//	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car obj = new Car();		// 			Abstract class's object cannot be created
		
		Audi  audi_obj  = new Audi();
//		audi_obj.Acclreate();
//		audi_obj.honking();
		
		WagonR wagnor_obj = new WagonR();
//		wagnor_obj.Acclreate();
//		wagnor_obj.honking();
		
		repair_shop( audi_obj);
		repair_shop(wagnor_obj);
	}

}
