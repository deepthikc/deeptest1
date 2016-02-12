package warmingup;

import java.util.Scanner;

public class ConstrctrMethd {
	private int stuID;
	   private String firstname;
	   private String lastname;
	  
	   ConstrctrMethd(){
		   stuID = 10;
		   firstname = "deepthi";
		   lastname = "kc";
	   }

	   ConstrctrMethd(int num1 , String str1, String str2)
	   {
	       //Parameterized constructor
	       stuID = num1;
	       firstname = str1;
	       lastname = str2;}
	  
	   public void age(){
		   Scanner scanner = new Scanner(System.in);// to get the input from the user
	       System.out.print("Enter the age of the student: ");
	       int n = scanner.nextInt();
	       int minage=n+10;
	       System.out.print("school insurance valid till the age of" +minage);
	       scanner.close();
	   }
	   public int getStuID() {
	       return stuID;
	   }
	   public void setStuID(int stuID) {
	       this.stuID = stuID;}
	  public String getfirstname() {
	     return firstname;
	   }
	   public void setfirstname(String firstname) {
	       this.firstname = firstname;
	   }
	   public String getlastname() {
	       return lastname;
	   }
	   public void setlastname(String lastname) {
	       this.lastname = lastname;
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrctrMethd m = new ConstrctrMethd();
	       System.out.println("Student Name is: "+m.getfirstname());
	       System.out.println("Student Age is: "+m.getlastname());
	       System.out.println("Student ID is: "+m.getStuID());
	       ConstrctrMethd m2 = new ConstrctrMethd(65, "manikandan", "g");
	       System.out.println("Student Name is: "+m2.getfirstname());
	       System.out.println("Student Age is: "+m2.getlastname());
	       System.out.println("Student ID is: "+m2.getStuID());
	       ConstrctrMethd m3 = new ConstrctrMethd(); 
	       m3.age();
}

	

}
