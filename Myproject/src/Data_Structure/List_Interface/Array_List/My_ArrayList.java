package Data_Structure.List_Interface.Array_List;

import java.util.ArrayList;

public class My_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList veg = new ArrayList();
		veg.add("Patato");
		veg.add("Tomato");
		veg.add("Cabbige");
		System.out.println(veg);
		
		ArrayList<Integer> prise = new ArrayList();
		prise.add(20);
		prise.add(30);
		prise.add(40);
		System.out.println(	prise);
		veg.addAll(	prise);
		veg.set(2,"carrot");
//		System.out.println(veg.get(3));
//		veg.remove(2);
//		System.out.println(veg);
//				
		
		System.out.println(veg);
		System.out.println();
		System.out.println(veg.toArray());
		
		Pair< String, Integer, Double > p1 =new Pair("sunil", 409,45.334343);
		p1.getdescription();
		
		Pair<Boolean, Double, String> p2 = new Pair(false, 34.534,"Sunil");
		p2.getdescription();
	}

}
