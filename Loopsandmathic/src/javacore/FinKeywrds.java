package javacore;

public class FinKeywrds {
	public void finalize()
	{
		System.out.println("finalize called");
		//the action that is carried out before an object being destroyed is specified
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			final int x=100;  
			// x=200;
			try{
			 int k=50/0;
			 System.out.println(k);
			}catch (Exception e){
				System.out.println(e);
			}
		finally{
			System.out.println("this code will be done");	
		}
			FinKeywrds f1=new FinKeywrds();  
			
			f1.finalize();
		 
			System.gc();
			System.out.println(x);
	}

    }
