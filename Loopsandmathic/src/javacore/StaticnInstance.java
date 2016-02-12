package javacore;

public class StaticnInstance {

	double a=4;
	double b=3;
	public static String name = "im good";
		
	static int totalLength(String a, String b) {
			
			// Add up lengths of two strings.
			return a.length() + b.length();
		    }
	public  void avgLength() {
			double r=(a+b)/2;
			 System.out.println("result is:"+r);
			
			    }
	 public static void main(String[] args){
			 StaticnInstance po=new StaticnInstance();
			 po.avgLength();
			 int total = totalLength("Golden", "Bowl");
	
		
			System.out.println("total length is  "+total);
			System.out.println(name);
		    }
	}


