package assignment3_3;
import java.util.ArrayList;
import java.util.ListIterator;

public class backward {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
			al.add("Ramya");
			al.add("Kollati");
			al.add("Ant"); 
			al.add("Vicky");
			al.add("orange");
			
			ListIterator<String> list1=al.listIterator(al.size());  
			 while(list1.hasPrevious())  
	         {  
	             String str=list1.previous();  
	             System.out.println(str);  
	         }  
			
}
}
