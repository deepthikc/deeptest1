package datastruc;
import java.util.HashSet;
import java.util.Iterator;
public class DemoUseOfDataStruc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet <String> hset = 
	               new  HashSet <String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset);
	      Iterator<String> it = hset.iterator();
	      while(it.hasNext()){
	         System.out.println(it.next());
	      }
	      HashSet<String> hset2 = new HashSet<String>();
	      hset2.add("Item1");
	      hset2.add("Item2");
	  
	      // Copying one Set to another
	      hset.addAll(hset2);
	  
	      System.out.println("Set after addAll:"+ hset);
	
	      hset2.clear();
	      System.out.println(hset2);
	}

}
