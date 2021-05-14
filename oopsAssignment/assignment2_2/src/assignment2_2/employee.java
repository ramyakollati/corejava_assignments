package assignment2_2;
public class employee {
		public int salary() {
			labour lab=new labour();
			int laboursalary=lab.salary();
			manager man=new manager();
			int managerSalary=man.salary();
			int incentive=1000,salary=10000;
			int totalsalary= laboursalary+managerSalary;
			return totalsalary;
		}

	}
