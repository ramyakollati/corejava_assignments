package assignment2_3;

public class bank {
	public int cash() {
		currentAccount ca=new currentAccount();
		int currentAccountcash=ca.cash();
		savingAccount sa=new savingAccount();
		int savingAccountcash=sa.cash();
		int fixedDeposit=1000,cash=10000;
		int totalcash= savingAccountcash+currentAccountcash;
		return totalcash;
	}

}
