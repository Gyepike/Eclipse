package com.anti.JDBC;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;


public class Solution {
	
	public static ArrayList<String> fix(ArrayList<String> strings) {
        //write your code here
         ArrayList<String> out = new ArrayList<String>();
        for (String string : strings) {
            //System.out.println(string);
            if( (string.indexOf("l") == -1) && (string.indexOf("r") == -1) )
            {
                out.add(string);
            }
            
            if( (string.indexOf("l") >= 0 ) && (string.indexOf("r") >= 0) )
            {
            	//System.out.println("tartalaz");
                out.add(string);
            }
            else {
            	if(string.indexOf("l") >= 0) {
            		 out.add(string);
            		 out.add(string);
            	}
            }
        }
        return out;
    }

	
	private static void executeFix() {
		ArrayList<String> strings = new ArrayList<String>();
	        strings.add("rose");
	        strings.add("love");
	        strings.add("lyra");
	        strings.add("cucul");
	        
	        strings = fix(strings);

	        for (String string : strings) {
	            System.out.println(string);
	        }
	}
	
	 public static Set<Integer> createSet() {
	        // write your code here

	      Set<Integer> set = new HashSet<Integer> ();
	      for(int i = 0; i < 20; i++) {
	          set.add(i);
	          
	      }
	      return set;
	    }
	 

	 public static Map<String, Integer> createintMap() {
	        // write your code here

	      Map<String, Integer> map = new HashMap<String,Integer> ();
	      for(int i = 0; i < 20; i++) {
	          
	          map.put("A"+i,i);
	      }
	      return map;
	    }
	 

	 public static void mapRemoveMapAllNumbersGreater(Map<String, Integer> map) { 
		 
		 System.out.println(map);
		 
		 System.out.println("Afeter removed !!");
		 Iterator<Entry<String, Integer> > entryinterator
             = map.entrySet().iterator();
		 
		 while(entryinterator.hasNext()) {
			 
			 Map.Entry<String, Integer> new_Map
             = (Map.Entry<String, Integer>)   
            		 entryinterator.next();

			   //System.out.println(new_Map.getKey() + " = "
               //        + new_Map.getValue());
			
			   if(new_Map.getValue() > 10)
			   {
				   entryinterator.remove();
			   }
		 }
		 
		 
		 System.out.println(map);
	 }
	 
	 

	 
	 public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
	        // write your code here
	        //Set<Integer> out = new HashSet<>(set);
	        
		    Iterator<Integer> iter = set.iterator(); 	 	
	       
		    while (iter.hasNext()) {
		        Integer number = iter.next();

		        if (number > 5  )
		            iter.remove();
		    }
		    
	        for(Integer number: set) {
	           System.out.println(number);
	        }
	         
	    }
	 
	 public static Map<String, Date> createMap() throws ParseException {
		  
	        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
	        Map<String, Date> map = new HashMap<>();
	        map.put("Smith", dateFormat.parse("MAY 1 2012"));
	        map.put("Johnson", dateFormat.parse("JUNE 1 2012"));
	        map.put("Williams", dateFormat.parse("JULY 1 2012"));
	        map.put("Brown", dateFormat.parse("AUGUST 1 2012"));
	        map.put("Jones", dateFormat.parse("SEPTEMBER 1 2012"));
	        map.put("Garcia", dateFormat.parse("MAY 1 2012"));
	        map.put("Miller", dateFormat.parse("JUNE 1 2012"));
	        map.put("Davis", dateFormat.parse("JUNE 1 2012"));
	        map.put("Rodriguez", dateFormat.parse("JUNE 1 2012"));
	        map.put("Martinez", dateFormat.parse("JUNE 1 2012"));
	      
	        Map<String, Date> copy = new HashMap<>(map);
			 
	        for (String key : copy.keySet()) {
	            Date date = copy.get(key);
	            int month = date.getMonth() + 1;
	            System.out.println(copy.get(key));
	            System.out.println(date.getMonth());
	            
	            
	            if (month == 6 || month == 7 || month == 8) {
	                map.remove(key);
	            }
	        }
	        
	        
	        for (String key : map.keySet()) {
	           System.out.println(key);
	           
	        }
	        
	        return map;
	    }
	 
	 

	public static void main(String[] args) {
		mapRemoveMapAllNumbersGreater(createintMap()); 
	
	}


}
