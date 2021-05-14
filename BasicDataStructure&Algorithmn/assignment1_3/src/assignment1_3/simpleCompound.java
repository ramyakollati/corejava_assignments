package assignment1_3;
import java.util.Scanner;

public class simpleCompound {

	public static void main(String[] args) {
		double principle,time,rate,si,ci;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		principle = sc.nextDouble();
		System.out.println("enter the number of years");
		time=sc.nextDouble();
		System.out.println("enter the rate of interest");
		rate = sc.nextDouble();
		si=(principle*time*rate)/100;
		ci=principle*Math.pow(1.0+rate/100.0,time)-principle;
		System.out.println("Simple Interest of "+time+" years is "+si);
		System.out.println("Compound Interest of "+time+ " years is "+ci);

	}

}
