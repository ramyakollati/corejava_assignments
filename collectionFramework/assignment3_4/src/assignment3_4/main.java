package assignment3_4;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		TreeSet<person> tree_set= new TreeSet<>();
		tree_set.add(new person(120,45,"ramya"));
		tree_set.add(new person(130,45,"kollati"));
		tree_set.add(new person(140,65,"anusha"));
		tree_set.add(new person(150,35,"chitti"));
		
		for(person element: tree_set)
			System.out.println(element);
		

	}

}
