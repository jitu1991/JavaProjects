package Data_Structure.mapInterface;

import java.util.*;

public class InternalWorkingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen p1 = new Pen(10 ,"Red");
		Pen p2 = new Pen(10 , "Red");

		System.out.println(p1);
		System.out.println(p2);
		
		Set<Pen> pens = new HashSet<>();
		
		pens.add(p1);
		pens.add(p2);
		System.out.println(pens);
		
		
	}

}
class Pen{
	int prize;
	String color;
	
	public Pen(int prize , String color) {
		this.prize = prize;
		this.color = color;
	}
//	************************************************************************

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + prize;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (prize != other.prize)
			return false;
		return true;
	}

	
	
//	************************************************************************
//	public boolean equal(Object obj) {
//		Pen that = (Pen) obj;
//		boolean isEqual = this.prize == that.prize &&
//				this.color.equals(that.color);
//		return isEqual;
//		}
//	public int hashCode() {
//		
//		return prize + color.hashCode();
//	}
//	************************************************************************

}