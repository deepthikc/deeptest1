package warmingup;
import java.util.Scanner;
public class Calculator {
	
	static Scanner sc= new Scanner(System.in);
	public void calculate(int a, int b)
		{	System.out.print("the result is     ");
				System.out.print(a+b);

		      }
	 public void calculate(double a1,int b1)
	 {
			System.out.println("the result is" + a1/b1);
	     }
	 public void calculate(long a2,long b2)
	 {
		 System.out.print("the result is     ");	         
		 System.out.println(a2-b2);
			       
		 }
	 public void calculate(int a3,long b3)
	{
	   System.out.println("the result is" + a3*b3);
			         
		}
	public static void main(String[] args){
			Calculator d=new Calculator();
			System.out.println("enter the choice");
			int choice=sc.nextInt();
		
			
		if(choice==1)
		{
			System.out.println("enter first number");
			int a=sc.nextInt();
			System.out.println("enter the second");
			int b=sc.nextInt();
			d.calculate( a,b);
		}
		if(choice==2)
		{
		
			System.out.println("enter first number");
			double a1=sc.nextInt();
			System.out.println("enter the second");
			int b1=sc.nextInt();
			d.calculate( a1,b1);
		}
		if(choice==3)
		{
			System.out.println("enter first number");
			long a2=sc.nextInt();
			System.out.println("enter the second");
			long b2=sc.nextInt();
			d.calculate( a2,b2);
		}
			if(choice==4)
			{
				System.out.println("enter first number");
				int a3=sc.nextInt();
				System.out.println("enter the second");	
				long b3=sc.nextInt();
				d.calculate( a3,b3);
			}
			
			
			}
			}
			
			
	


