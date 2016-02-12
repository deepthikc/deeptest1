package datastruc;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Iterator;
public class Hashmata {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		 Hashtable<String,String> hashtableobj = new Hashtable<String, String>();
	        hashtableobj.put("Alive is ", "awesome");
	        hashtableobj.put("Love", "yourself");
	        System.out.println("Hashtable object output :"+ hashtableobj);
	     
	        hashtableobj.put("key2", "value2");
	        hashtableobj.put("key3", "value3");
	        hashtableobj.put("key4", "value4");
	        
	        System.out.println("Hashtable object output :"+ hashtableobj);
	         
	        Iterator<String> iterator = hashtableobj.keySet().iterator();
	        while(iterator.hasNext()){
	            iterator.next();
	            iterator.remove();
	            System.out.println(hashtableobj);
	        }
	 
	        HashMap<String, String> hashmapobj = new HashMap<String, String>();
	        
	        hashmapobj.put("Alive is ", "awesome");  
	        hashmapobj.put("Western", "values");
	        hashmapobj.put("Love", "yourself"); 
	       
	        System.out.println("HashMap object output :"+hashmapobj);
	        hashmapobj.put(null, "values");
	       try{
	        hashtableobj.put(null, "value");}
	       catch(Exception e){
	    	   System.out.println(e);
	    
	       }
	}

}
