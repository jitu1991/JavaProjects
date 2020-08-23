package Data_Structure.comparable;

public class Student		/* implements Comparable<Student> */{
	
	int marks;
	String name;
	
	public Student(	int marks,String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

/* if we don't implement the "Comparable<>" interface 
	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub

		return this.marks - obj.marks;
*/
		
//		both are similar
		
//		if(this.marks > obj.marks)return 1;
//		else if(this.marks < obj.marks)return -1;
//		else return 0;
	}


//	@Override
//	public int compareTo(Student that) {
//		// TODO Auto-generated method stub
//			if(this.marks > that.marks) return 1;
//			elseif(this.marks < that.marks) return -1;
//			else return 0;
//	}


	

//	}