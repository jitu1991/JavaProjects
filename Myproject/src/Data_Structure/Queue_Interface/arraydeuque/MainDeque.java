package Data_Structure.Queue_Interface.arraydeuque;

import Data_Structure.List_Interface.*;

public class MainDeque {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		//		Doubly Ended Queue
		
		
		/*	Operation				Method					Method Throw Exception
		 * 
		 * Insertion from head		offerFirst()			addFirst()
		 * Removal from head		pollFirst()				removeFirst()
		 * Retrieval from head		peekFirst()				getFirst()
		 * 
		 * Insertion from tail		offerLast()				addLast()	
		 * Removal from tail		pollLast()				removeLast()
		 * Retrieval from tail		peekLast()				getLast()
		 *
		 * ArrayDeque As a stack
		 * push()
		 * pop()
		 * peek()
		 * 
		 * ArrayDeque as a Queue
		 * 	Throw Exception 				return false/null
			add()							offer()
			remove()						poll()
			element()						peek()
	
		 * 
		 * */
		
		

//		ArrayDeque<Integer> ad = new ArrayDeque<>(); 
//		ad.offerFirst(5);
//		ad.offerFirst(56);
//		ad.offerFirst(7);
//		System.out.println(ad);
//		ad.pollFirst();
//		ad.removeFirst();
//		System.out.println(ad);
		
		MyDeque<Integer> md = new MyDeque<>();
//		System.out.println(md.getfirst());
//		md.offerfirst(45);
//		md.pollfirst();
//		md.addfirst(23);
//		md.addlast(7);
//		md.print();
//		System.out.println();
//		md.removefirst();
//		md.print();
//		System.out.println();
//		System.out.println();
//		md.addfirst(1);
//		md.addfirst(2);
//		md.addfirst(3);
//		md.addfirst(4);
//		md.print();
//		System.out.println();
//		md.removelast();
//		md.removelast();
//		md.removefirst();
//		
//		md.print();
//		System.out.println();
//		System.out.println(md.peekfirst());
//		md.print();
//		System.out.println();
//		System.out.println(md.getfirst());
		System.out.println("******** Function of stack********");
		System.out.println();
		md.push(45);
		md.push(78);
		md.print();
		md.push(6);
		System.out.println();
		System.out.println(md.peek());
		System.out.println();

		md.print();
		System.out.println();

		md.pop();
		md.print();
	}


	}


