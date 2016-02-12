package javacore;

public class Equls {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj1 = new String("xyz");

		// now obj2 and obj1 reference the same place in memory
		String obj2 = obj1;

		if(obj1 == obj2)
		   System.out.println("obj1==obj2 is TRUE");
		else
		  System.out.println("obj1==obj2 is FALSE");
		//Equals method
		String obj3 = new String("dee");

		String obj4 = new String("dee");

		if(obj1.equals(obj2))
		   System.out.println("obj3==obj4 is TRUE");
		else
		  System.out.println("obj3==obj4 is FALSE");

	}

}
