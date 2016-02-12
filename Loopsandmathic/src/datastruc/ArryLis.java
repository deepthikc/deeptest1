package datastruc;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ArryLis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> spic = new ArrayList<String>();
        //add elements to the ArrayList
		spic.add("meena");
		spic.add("rudi");
		spic.add("suda");
		spic.add("litta");
        System.out.println(spic);
        //get elements by index
        System.out.println("Element at index 1: "+spic.get(1));
        System.out.println("Does list contains meena? "+spic.contains("meena"));
        //add elements at a specific index
        spic.add(2,"kripu");
        System.out.println(spic);
        System.out.println("Is arraylist empty? "+spic.isEmpty());
        System.out.println("Index of suda is "+spic.indexOf("suda"));
        System.out.println("Size of the arraylist is: "+spic.size());
        spic.add("Third");
       spic.add("Random");
       //reading all elements from ArrayList by using Iterator
        Iterator<String> itr = spic.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
      //use of clone function to duplicate array
        System.out.println("Actual ArrayList:"+spic);
        ArrayList<String> copy = (ArrayList<String>) spic.clone();
        System.out.println("Cloned ArrayList:"+copy);
        //getting arraylist content based on index
        System.out.println("Actual ArrayList:"+spic);
        List<String> list = spic.subList(2, 4);
        System.out.println("Sub List: "+list);

        //copying elements of arraylist to array using toarray()
        System.out.println("Actual ArrayList:"+spic);
        String[] strArr = new String[spic.size()];
        spic.toArray(strArr);
        
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }
        //deleting all elements of array using clear()
        spic.clear();
        System.out.println("After clear ArrayList:"+spic);

	}

}
