package praexcphand;

public class DemoExcp {
	static void validate(int age)throws Exception
	{  
	     if(age<18)
	     { 
	    	 throw new ArithmeticException("not valid"); 
	    	 }
	     else 
	     {
	    	 System.out.println("welcome to vote"); 
	    	 }
	     }  
	 
	public static void main(String[] args)  
	{
		
		//use of try catch to handle an exception
		try
		{
	         int num1=30, num2=0;
	         int output=num1/num2;
	         System.out.println ("Result = " +output);
	      }
	    catch(ArithmeticException e)
		{
	         System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
	      }
		finally{

		System.out.println("this will be executed");
		}
try
		{
			validate(13);  }
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	      System.out.println("rest of the code...");  
	        
	    
	       
	      System.out.println("normal flow");  
	    
	}

}
