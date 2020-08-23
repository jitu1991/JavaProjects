package Data_Structure.List_Interface.Linked_List;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		
		//System.out.println(al.get(0));
		al.add(34);
		
		al.add(67);
		System.out.println(al);
		System.out.println(al.get(1));
		al.set(0,5);
		al.remove(0);
		System.out.println(al);
	
		
		ll.add(3);
		ll.add(6);
		System.out.println(ll);
		System.out.println(ll.get(0));
		ll.set(0,5);
		ll.remove(0);
		System.out.println(ll);
		
		getdiff(al);
		getdiff(ll);
		

	}
	public static void getdiff(List<Integer> list) {
		long start =System.currentTimeMillis();
	
		for(int i = 0; i<100000;i++ ) {
			list.add(0,i);
		}
		long end =System.currentTimeMillis();
		
		System.out.println("Difference is : "+list.getClass().getName()+"	"+(start - end));
	}

}
