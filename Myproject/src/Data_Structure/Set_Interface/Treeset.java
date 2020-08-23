package Data_Structure.Set_Interface;

import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> num = new TreeSet<>();
		Set<Integer> num1 = new TreeSet<>();

		System.out.println("  The class TreeSet show all the added element in the Sorted form added by the user");
		num.add(5);
		num.add(3);
		num.add(8);
		num.add(1);
		num.add(20);
		num.add(2);
		System.out.println(num);
		num1.add(1);
		num1.add(20);
		num1.add(2);
		num1.add(78);
		num1.add(89);
		System.out.println(num1);

//		Operation of Set
//		Union
		num.addAll(num1); /* union function*/
		System.out.println(num);
		
////		Intersection
		num.retainAll(num1); /* union function*/
		System.out.println(num);

		
//		Subset
		num.addAll(num1); /* union function*/
		System.out.println(num);

		
	}

}
