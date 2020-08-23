package Data_Structure.List_Interface.Array_List;

public class Pair<X,Y,Z> {
	X x;
	Y y;
	Z z;
	
	public Pair(X x,Y y, Z z ) {
		this.x=x;
		this.y=y;
		this.z=z;
	}

//	public Pair(X x,Y y ) {
//		this.x=x;
//		this.y=y;
//	}
	public void getdescription() {
		System.out.println("Supporting Genneric");
		System.out.println(x+"	and   "+y+"	  and    "+z);
	}

}
