package warmingup;

import java.util.Scanner;
public class ConvMile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter the miles to be converted to kilometers: ");
	       int m = scanner.nextInt();
	       scanner.close();
	       Scanner scaner = new Scanner(System.in);
	       System.out.print("Enter the centimeters to be converted to meter: ");
	       int c = scanner.nextInt();
	       scaner.close();
	
	

for(int i=0; i <= 1 ; i++)
{
        switch(i){
case 1:
	double k;
	k=1.609*m;
	System.out.println(+m+ " miles is equal to " +k+ "kilometers");
case 2:
	double mt;
	mt=0.01*c;
	System.out.println(+c+ " centimeters is equal to " +mt+ "meters");
	

}}}}