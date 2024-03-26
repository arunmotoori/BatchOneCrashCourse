package interfacesdemo;

public interface Bank {
	
	String accountType1 = "Savings";  // final type, but also static type
	String accountType2 = "Current"; // final and static type
	
	public void depositMoney();
	
	public void transferMoney();
	
	public void withdrawMoney();
	
	default void applyForLoan() {
		
		System.out.println("Loan applied at Bank");
		
	}
	
	public static void createUser() {
		
		System.out.println("User created in this Bank");
		
	}
	
}

class HDFCBank implements Bank {
	
	int giftPrice = 100;
	final static String accountType3 = "SpecialHDFCBankAccount";

	/*
	public void applyForLoan() {
		System.out.println("Loan applied in HDFC Bank");
	}*/

	public void depositMoney() {
		
		System.out.println("Money deposited into HDFC Bank");
		
	}

	public void transferMoney() {
		
		System.out.println("Money transferred from HDFC Bank");
		
	}
	
	public void withdrawMoney() {
		
		System.out.println("Money withdrawn from HDFC Bank");
		
	}
	
	public void giveFreeGift() {
		
		System.out.println("Gift from HDFC Bank");
		
	}
	
}