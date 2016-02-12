package javacore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class ListSetMap {
	Set<String> s = new HashSet<String>();
	ArrayList<String> j = new ArrayList<>();
	Map<String, Integer> map = new HashMap<String, Integer>();
	 
	 public void rolnumname(){
		 map.put("deepthi",1);
		   map.put("ravi",2);
		   map.put("kiran",3);
		   map.put("latha",4);
		   //get the Set Of keys from HashMap
		   Set<String> keys = map.keySet();
		   //get the Iterator instance from Set
		   Iterator<String> iterator = keys.iterator();
		   // Loop the iterator until we reach the last element of the HashMap
		   while (iterator.hasNext()) {
			   //next() method returns the next key from Iterator instance.
			   //return type of next() method is Object so we need to do DownCasting to String
			   String key = (String) iterator.next();
			  /*once we know the 'key', we can get the value from the HashMap
			   by calling get() method*/
			   Integer value = (Integer)map.get(key);
			   
			   System.out.println("roll no: "+ value+" Name: "+ key);
		   }
	 }
	public void sexofstudnt(){
		j.add("1.f");
		j.add("2.m");
		j.add("3.m");
		j.add("4.f");
		for (String value : j) {
		    System.out.println(value);
		}}
	public void phnum(){
		s.add("1.254");
		s.add("2.554");
		s.add("3.897");
		s.add("4.456");
		System.out.println("the ph numbers are" +s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListSetMap p=new ListSetMap();
		p.rolnumname();
	
		p.sexofstudnt();
		p.phnum();
		
	}

}
