package Data_Structure.List_Interface.Linked_List;

public class My_LL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Implementation_LL<String> ll =new Implementation_LL<>();
		
	//	System.out.println(ll.isEmpty());
		ll.Add("sunil");
		ll.Add("anuj");
		ll.Add("amit");
		ll.Add("Yeshvi");
		//System.out.println(ll.isEmpty());
		ll.removeLast();
		
		ll.print();
		
		
		System.out.println();
		System.out.println("Size of the List is : "+ll.size());
		System.out.println("Size of the List is : "+ll.size());
//		ll.removeAll();
//		ll.Add("Manisha");
//		ll.print();
//		System.out.println();
//		System.out.println("Size of the List is : "+ll.size());
//		
	}

}
