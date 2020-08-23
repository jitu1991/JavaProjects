package Data_Structure.List_Interface.Linked_List;

public class Implementation_LL<E> {
	
	public Node<E> head;
	
	public void Add(E data) {
		Node<E> toadd = new Node<E>(data);
		if(isEmpty()) {
			head = toadd;
			return;
		}
		
		Node<E> temp =head;
		while(temp.next != null) {
			temp= temp.next;
		}
		temp.next = toadd;
		
		
	}
	
	public void print() {



		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		Node<E> temp = head;
		while(temp != null) {
				System.out.print(temp.data+",   ");
				temp = temp.next;
		}
		return;
		
	}
	
	public int size() {


		Node<E> temp = head;
		int element = 0;
		while(temp != null) {
			element++;
			temp = temp.next;

		}
		return element;
	}
	public void removeAll() {

		
//		This code is only for null List 
		if(isEmpty()) {
			System.out.println("Cann't Remove Due to Empty List ");
			return;
		}
//		till here
		
//		This code for more than one element in the List
		Node<E> temp = head;
		while(temp != null) {
			temp.next = null;
			temp = temp.next;
		}
//		till here
		
//		This part of code is only for one element
		if(head.next == null) {
			head = null;
			return;
		}
//		till here
	}

	public boolean isEmpty() {

		if(head == null) {
			return true;
		}else
			return false;
	}
	
	void addALL(){



		
	}
	void get(E index){
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		
//	not complete		}
	}
	void set(E index, String data) {
		
	}
	
	public E removeLast() throws Exception{
// 		for empty list	
		if(isEmpty()) {
			throw new Exception(" Poping from the Empty list is not Allowed");
		}
//		for one element 
		Node<E> temp = head;
		if(head.next == null) {
			Node<E> toremove = head;
			head = null;
			return (E) toremove.data;
			
		}
		
//		There (temp.next.next) move us to the second LAst element 
//		Example 23, 34, 65, 34, here 65
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node toremove = temp.next;
		temp.next = null;
		return (E) toremove;
	}
	
	public class Node<E>{

		
		public E data;
		public Node<E> next;
	
		Node(E data){
			this.data =data;
			next = null;
		}
	}

	
}
