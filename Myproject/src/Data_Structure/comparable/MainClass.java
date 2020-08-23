package Data_Structure.comparable;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> stu = new ArrayList<>();
		stu.add( new Student(10, "Yeshvi"));
		stu.add( new Student(9, "Yeshvi"));
		stu.add( new Student(3, "Yeshvi"));
		stu.add( new Student(5, "Yeshvi"));
		stu.add( new Student(4, "Yeshvi"));
		stu.add( new Student(8, "Yeshvi"));


//		stu.add( new Student (409 , "Sunil"));
//		stu.add( new Student (421 , "Sunil"));
//
//		stu.add( new Student(433, "Ashish"));
//		stu.add( new Student(450 , "Vinay"));
//		stu.add( new Student(383, "Devika"));
//		stu.add( new Student(383, "Auskan"));
//
		stu.add( new Student(407, "Vikey"));
//		
//		Lemma Expresion
		stu.forEach(System.out::println);
		
/*	if we don't implement the "Comparable<>" interface 
		Collections.sort(stu);
*/
//		shorting of object using comparator
		Collections.sort(stu , new sortByNamethenMArks());

		
		System.out.println();
		stu.forEach(System.out::println);

	}

}

class sortByNamethenMArks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if( o1.name.equals(o2.name)) {
			if(o1.marks < o2.marks) return 1;
			else if(o1.marks > o2.marks) return -1;
			else return 0;
//			return o2.marks - o1.marks;
		}
		else 
		return o1.name.compareTo(o2.name);
	}
	
}