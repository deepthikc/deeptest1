package javacore;

public class BrkCntue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i <= 1 ; i++)
		
		switch(i)
		{
		case(1):
			System.out.println("break demo");
		for (int k = 1; k <= 10; k++)
	      {
			
	         if (k == 5)
	         {
	            break;    // terminate loop if i is 5
	         }

	         System.out.print(k+ " ");
	      }

	      System.out.println("Loop is over.");
	
	case (2):
		System.out.println("continue demo");
	for (int k= 1; k <= 10; k++)
      {
         if (k % 2 == 0)
         {
            continue;    // skip next statement if i is even
         }

         System.out.println(k + "");
      }}

}}
