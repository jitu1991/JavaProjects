package Data_Structure.Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>  fruit = new HashSet();
		Set<String> veg = new HashSet<>();
//	testing of collecton's	function
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Grapse");
		fruit.add("Kivi");
		fruit.add("Papaya");
		System.out.println(fruit);
//		Set don't allow duplicaty
		fruit.add("Apple");
		
		veg.add("Patato");
		veg.add("tamato");
		 veg.add("Apple");
		 veg.add("Papaya");
		 veg.add("Grapse");
		System.out.println(veg);

//		 veg.addAll(fruit);
		System.out.println(veg);
		fruit.remove("apple");
		System.out.println(fruit);
		System.out.println(veg);
		
		System.out.println(veg.size());
		System.out.println(fruit.size());
		System.out.println(veg.contains("Apple"));
		System.out.println(veg.containsAll(fruit));
		
//		Operation of Set
//		Union
		fruit.addAll(veg); /* union function*/
		System.out.println(fruit);
		
////		Intersection
		fruit.retainAll(veg); /* union function*/
		System.out.println(fruit);

//		Subset
		System.out.println(fruit.containsAll (veg)); /* union function*/
		System.out.println("555"+fruit);

		
		

	}

}


