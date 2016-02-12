package javacore;

public class Stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";//creating string by java string literal  
		  
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);//converting char array to string  
		  
		String s3=new String("example");//creating java string by new keyword  
		  
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
		StringBuffer sBuffer = new StringBuffer(" test");
	       sBuffer.append(" String Buffer");
	       System.out.println(sBuffer);  
	       StringBuilder str = new StringBuilder("tutorials ");
	       System.out.println("string = " + str);
	        
	       // appends the string argument to the StringBuilder
	       str.append("point");
	       // print the StringBuilder after appending
	       System.out.println("After append = " + str);
	        
	       str = new StringBuilder("1234 ");
	       System.out.println("string = " + str);
	       // appends the string argument to the StringBuilder 
	       str.append("!#$%");
	       // print the StringBuilder after appending
	       System.out.println("After append = " + str);
	       
	}

}
