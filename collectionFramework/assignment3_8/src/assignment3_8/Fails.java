package assignment3_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Fails {

	public static void main(String[] args) {
	
    HashSet<Object> hash=new HashSet();
		
		hash.add("ramya");
		hash.add("kollati");
		hash.add(100);
		hash.add(500);

		Iterator i=hash.iterator();
		 while(i.hasNext())
		   {
			   
			   Object a=i.next();
			   hash.add("hi");
			   System.out.println(a); 
		   }
	}
}
