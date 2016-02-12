package warmingup;
import java.util.Scanner;

public class FactRecursion {
	
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);// to get the input from the user
       System.out.print("Enter the number whose factorial is to be found: ");
       int n = scanner.nextInt();//user input stored in n
       scanner.close();
       int result = factorial(n);
       System.out.println("The factorial of " + n + " is " + result);
   }
   public static int factorial(int n) {
	   if (n == 0) {
           return 1;
       } else {
           return n * factorial(n - 1);//recursion, calling the method again
       }

  
   }}

