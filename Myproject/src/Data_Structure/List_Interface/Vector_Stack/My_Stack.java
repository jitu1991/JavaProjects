package Data_Structure.List_Interface.Vector_Stack;

import Data_Structure.List_Interface.Linked_List.Implementation_LL;

public class My_Stack<E> extends Implementation_LL {
//	Implementing my Stack using my (Implementation_LL<E>) Linked List 
	
	private Implementation_LL<E> ll = new Implementation_LL<>();
	
	public void Push(E e) {
//		This Add function is build by me in the Implementation_LL
		ll.Add(e);
	}
	public E Pop() throws Exception {
//		This removeLast function is build by me in the Implementation_LL
//		if(isEmpty()) {
//			throw new Exception("Poping from empty list is not allowed ");
//		}
		return ll.removeLast();

	}

	public E Peek()/* throws Exception */{
//		if(isEmpty()) {
//			throw new Exception("Peeking  from an Empty List ");
//		}
		if( head.next == null) {
			return (E) head.data;
		}
		Node temp = head;
		while(temp.next != null) {
			
			temp = temp.next;
		}
		return  (E) temp.data;
		
	}
}
