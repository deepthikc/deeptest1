package javacore;

public class BrkCntue {

	public static void main(String[] args) {
	
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
	
	
		System.out.println("continue demo");
		for (int k= 1; k <= 10; k++)
      {
         if (k % 2 == 0)
         {
            continue;    // skip next statement if i is even
         }

         System.out.print(k + " ");
      }
 }

}

