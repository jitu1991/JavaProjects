package Data_Structure.Queue_Interface.arraydeuque;

import Data_Structure.List_Interface.*;

public class MyDeque<E> {

	Node<E> head/*>>*/ , tail/*<<<*/;

	public void addToLast(E data) {
		Node<E> toadd = new Node<>(data);
		if(head == null) {
			head = tail = toadd;
			return;
		}
		head.next = toadd;
		toadd.previous = head;
		head = toadd;
	}
	public void addToStart(E data) {
		Node<E> toadd = new Node<>(data);
		if(head == null) {
			head = tail = toadd;
			return;
		}
		tail.previous = toadd;
		toadd.next = tail;
		tail = toadd;
	
		
	}
	
	public E removeFromStart() {
		if(head == null) {
			return null;
		}
		Node<E> toremove = tail;
		tail = tail.next; 
		tail.previous = null;
	
		if(tail == null) {
			head = null;
		}
		return (E) toremove;

	}
	public E removeFromLast() {


		if(head == null) {
			return null;
		}
		Node<E> toremove = tail;
		head = head.previous; 
		head.next = null;

		if(head == null) {
			tail = null;
				}
		return (E) toremove;


		
	}
	
	public void offerfirst(E data) {

		addToStart( data);
	}
	public void addfirst(E data) {

		addToStart(data);
		}
	public E pollfirst() {


		if(head == null) {
			return null;
		}
		return removeFromStart();
	}
	public E removefirst() throws Exception {
		if(head == null) {
			throw new Exception("Removing from an empty list");
		}
		return removeFromStart();
	}
	
	public void offerlast(E data) {
		addToLast(data);
	}
	public void addlast(E data) {
		addToLast(data);
	}
	public E polllast() {

		if(tail == null) {
			return null;
		}
		return removeFromLast();
	}
	public E removelast() throws Exception {
		if(tail == null) {
			throw new Exception("Remove from last to an empty list");
		}
		return removeFromLast();
	}
	
	
	public E peekfirst() {

		if(head == null) {
			return null;
		}
//		Node<E> toremove = tail;
//		tail = tail.next; 
//		tail.previous = null;
	
		if(tail == null) {
			head = null;
		}
		return (E) tail.data;

		
	}
	public E getfirst() throws Exception{

		if(head == null) {
			throw new Exception("removing from an empty list");
//			return ;
		}
		Node<E> toremove = tail;
		tail = tail.next; 
//		tail.previous = null;
	
		if(tail == null) {
			head = null;
		}
		return (E) toremove.data;

		
	}
	public E peeklast() {


		if(head == null) {
			return null;
		}
//		Node<E> toremove = tail;
//		head = head.previous; 
//		head.next = null;

		if(head == null) {
			tail = null;
				}
		return (E) head.data;

	}
	public E getlast() throws Exception {
		if(head == null) {
			throw new Exception("Removing from empty list");
		}
		Node<E> toremove = tail;
		head = head.previous; 
//		head.next = null;

		if(head == null) {
			tail = null;
				}
		return (E) toremove;

	
}

	//	 * ArrayDeque As a stack
	public void push(E data) {
		addToLast(data);
	}
	public E pop() {
		return removeFromLast();
	}
	public E peek() {


		return peeklast();
	}

	//	 * ArrayDeque as a Queue


	
	class Node<E>{

		E data;
		Node<E> next, previous;
			public Node(E data) {		/* Constructor	*/
				this.data = data;
				this.next = this.previous = null;	
			}
	}


	public void print() {
		// TODO Auto-generated method stub
		
		Node<E> temp = tail;
		while(temp.next != null) {
			System.out.print(temp.data+",  ");
			temp = temp.next;
		}
		if(head.next == null) {
			System.out.print(head.data+",  ");
		}
		
	}

}
