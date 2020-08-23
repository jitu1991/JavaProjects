package Data_Structure.Queue_Interface;


import Data_Structure.List_Interface.Linked_List.Implementation_LL;


public class MyQueue<E> {

Node<E> head/*<<<*/, rear/*>>>*/;

	
	public void enQueue(E data) {
		
		Node<E> toAdd = new Node<E>(data);
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
		return;
	}
	public E deQeque() throws Exception  {

		if(head == null) {
//			return null;
			throw new Exception("Removing from an empty list");
		}
		Node<E> temp = head;
		head = head.next;
		return (E) temp.data;
	}
	public void print() throws Exception {

		if(head == null) {
			throw new Exception("Printing of an empty list");
		}
		Node<E> temp = head;/*	created an temp node for moving ahead */
		while(rear != null ) {
			if(temp == rear) {
				System.out.print(temp.data+",  ");
//				for printing in next line 
				System.out.println();
				return;
			}
			System.out.print(temp.data+",  ");
			temp = temp.next;
		}
//		for printing in next line 
		System.out.println();
	}
	
	
	
	class Node<E>{
		E data;
		Node<E> next;
		public Node(E data) {
			this.data = data;
			next = null;
			
		}
	}


}
