package assignment3_2;
import java.util.Iterator;  
import java.util.LinkedHashSet;  
  
public class linkedhash {   
	
     public static void main(String args[]){ 
    	 
            LinkedHashSet<String> lh=new LinkedHashSet(); // Implementing HashSet     
                   lh.add("ramya");    // Adding elements  
                   lh.add("kollati");      
                   lh.add("ant");
                   lh.add("dog");
              Iterator<String> i=lh.iterator(); // Traversing objects    
                   
                   while(i.hasNext()) // Return true if the Scanner has another token input    
                   {    
                   System.out.println(i.next());// printing elements     
                   }    
     }    
    }   
