package assignment3_2;
import java.util.HashSet;  
import java.util.Iterator; 

public class hash {
	
     public static void main(String args[]){   
    	 
        HashSet<String> h=new HashSet();  // Implementing HashSet  
        
               h.add("ramya");    //Adding elements  
               h.add("kollati");      
               h.add("ant");     
               h.add("mosquito");    
               h.add("cockroach"); 
               h.add("dog");
               
               Iterator<String> i=h.iterator();  // Traversing objects  
               
               while(i.hasNext())  // Return true if the Scanner has another token input  
               {    
               System.out.println(i.next()); // printing elements   
               }    
     }    
}  
