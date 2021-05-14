package assignment1_5;
import java.util.Scanner;

public class incomeTax {

	public static void main(String[] args) {
	 double amount,tax,percent = 0,taxamount;
	 System.out.println("Enter the amount");
	 Scanner sc = new Scanner(System.in);
	 amount = sc.nextDouble();
	
	 if(amount>0 && amount<=180000)
		 System.out.println("nill \t:"+amount);
	 else if(amount>=180001 && amount<=300000) {
		 percent=10;
		 tax=(amount*percent)/100;
		 System.out.println("taxable amount is  \t:"+tax);
		 taxamount=tax+amount;
		 System.out.println("total taxable amount is \t:" +taxamount);
	 }
	 else if(amount>=300001 && amount<=500000) {
		 percent=20;
		 tax=(amount*percent)/100;
		 System.out.println("taxable amount is  \t:" +tax);
		 taxamount=tax+amount;
		 System.out.println("total taxable amount is \t:"+taxamount);
	 }
		 else {
			 percent=30;
			 tax=(amount*percent)/100;
			 System.out.println("taxable amount is  \t:"+tax);
			 taxamount=tax+amount;
			 System.out.println("total taxable amount is \t:"+taxamount);
		 }
	 }
		 

	}

