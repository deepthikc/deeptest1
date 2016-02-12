package praexcphand;

public class FiveExcpCls {
	private String str;
	public void arimexp() throws Exception
	{
	
		int result=7/0;
		System.out.println ("Result = " +result);
	    System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
	}
	public void arayexc()throws Exception
	{
		int a[]=new int[10];
	        //Array has only 10 elements
	    a[11] = 9;
	    System.out.println ("ArrayIndexOutOfBounds");
	}
	public void numfrmexcp() throws Exception
	{

		 int num=Integer.parseInt ("XYZ") ;
		 System.out.println(num);
		 System.out.println("Number format exception occurred");
	}
	public void stringotbnd()throws Exception
	{
	
		 String str="easysteps2buildwebsite";
		 System.out.println(str.length());;
		 char c = str.charAt(0);
		 c = str.charAt(40);
		 
		 
		 System.out.println(c);
		 System.out.println("StringIndexOutOfBoundsException");
	       
	}
	public void nulpntrexc()throws Exception
	{
	
		str = null;
		System.out.println (str.length());
		System.out.println("NullPointerException");
	}
   public static void main(String args[])
    {  
	   FiveExcpCls ar=new FiveExcpCls();
	   try{
		   ar.arimexp();
    }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   FiveExcpCls  ary= new FiveExcpCls();
	   try{
		   ary. arayexc();
		   }
	   catch(Exception e)
	   {
		   System.out.println(e);
		   }	

	   FiveExcpCls   nfe =new FiveExcpCls();
	   try
	   {
		   nfe. numfrmexcp();
	    }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   FiveExcpCls sgb =new FiveExcpCls();
	   try
	   {
		   sgb. stringotbnd();
		}
	   catch(Exception e)
	   {
		   System.out.println(e);

	   }
	   FiveExcpCls  npe=new FiveExcpCls();
	   try
	   {
		   npe. nulpntrexc();
	   }

	   catch(Exception e)
	   {
		   System.out.println(e);
	   }

	
    }
   }
