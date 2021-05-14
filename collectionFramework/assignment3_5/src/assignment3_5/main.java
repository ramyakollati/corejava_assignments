package assignment3_5;
import java.util.Map.Entry;
import java.util.*;

public class main {

	public static void main(String[] args) {
		employee e1=new employee(1009,"ramya",15000,"ramya@mail.com");
		employee e2=new employee(1020,"kollati",55000,"kollati@mail.com");
		employee e3=new employee(1005,"Anusha",24500,"anusha@mail.com");
		employee e4=new employee(1010,"happy",87000,"happy@mail.com");
		
		department d1 = new department(15000,"ECE","MUMBAI");
		department d2 = new department(30000,"CSE","HYDERABAD"); 
		
		Map<employee,department> empDeptMap = new HashMap<>();
		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d2);
		empDeptMap.put(e3, d1);
		empDeptMap.put(e4, d2);
		
		Set<Entry<employee,department>> entrySet = empDeptMap.entrySet();
		Iterator<Entry<employee,department>>iterator= entrySet.iterator();
		
		for(Entry<employee,department> entry:entrySet) {
			employee employee = entry.getKey();
			department department = entry.getValue();
			
			System.out.println(employee);
			System.out.println(department);
			
		}
		
		
		
	}

}
