package interfacesdemo;

public class Demo {

	public static void main(String[] args) {
		
		//Bank bank = new Bank();
		
		HDFCBank hdfc = new HDFCBank();
		hdfc.depositMoney();
		hdfc.transferMoney();
		hdfc.withdrawMoney();
		hdfc.giveFreeGift();
		System.out.println(hdfc.giftPrice);
		System.out.println(Bank.accountType1);
		System.out.println(Bank.accountType2);
		System.out.println(HDFCBank.accountType1);
		System.out.println(HDFCBank.accountType2);
		
		Bank bank = new HDFCBank();
		
		bank.depositMoney();
		bank.withdrawMoney();
		bank.transferMoney();
		
		
		

	}

}
