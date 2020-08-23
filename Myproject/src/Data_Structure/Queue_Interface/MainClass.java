package Data_Structure.Queue_Interface;

import Data_Structure.List_Interface.*;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Throw Exception 				return false/null
//		add()							offer()
//		remove()						poll()
//		element()						peek()
		
//	using Queue
//		Queue<Integer> q = new LinkedList<>();
//		q.add(44);
//		q.add(23);
//		q.add(78);
//		System.out.println(q);
//		System.out.println(q.element());
//		System.out.println(q.remove());
//		
//		System.out.println(q.element());
//		System.out.println(q.remove());
//		System.out.println(q.element());
//		System.out.println(q.remove());
//		System.out.println(q.peek());
	
//	MY implemented 	Queue
		MyQueue<Integer> myQueue = new MyQueue<>();
//		System.out.println(myQueue.deQeque());
		myQueue.enQueue(56);
		myQueue.enQueue(76);
		myQueue.enQueue(12);
		myQueue.enQueue(89);
		myQueue.print();
		System.out.println(myQueue.deQeque());
		myQueue.print();
		System.out.println(myQueue.deQeque());
		myQueue.print();
		System.out.println(myQueue.deQeque());
		myQueue.print();
		System.out.println(myQueue.deQeque());

//		System.out.println(myQueue.deQeque());

	}



	

}
