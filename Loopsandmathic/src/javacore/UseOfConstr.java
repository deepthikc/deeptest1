package javacore;

import java.util.Scanner;

public class UseOfConstr {

	
	Scanner sc=new Scanner(System.in);
		 public UseOfConstr(){
		        System.out.println("student details display inside default constructor");
		        
		    }
		    public UseOfConstr(int i){
		        System.out.println("Inside single parameter constructor with age value");
		        System.out.println("enter the age");
		        i=sc.nextInt();
		        System.out.println(i);
		    }
		    public UseOfConstr(String str){
		        System.out.println("Inside single parameter constructor with name as String object");
		        System.out.println("enter the name");
		        String name=sc.next();
		        System.out.println(name);
		    }
		    public UseOfConstr(int i, int j){
		        System.out.println(" double parameter constructor with rank and class as input");
		        System.out.println("enter the rank and class");
		        i=sc.nextInt();
		        j=sc.nextInt();
		        System.out.println("rank"+i);
		        System.out.println("class"+j);
		        
		        
		    }
		     
		    public static void main(String a[]){
		    	UseOfConstr mco = new UseOfConstr();
		    	UseOfConstr spmco = new UseOfConstr(10);
		    	UseOfConstr dpmco = new UseOfConstr(10,20);
		    	UseOfConstr dpmco9 = new UseOfConstr("java2novice");
		    }
	}


