
public class SavingsAccount extends BankAccount{

	
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		
		super(name, amount);
		accountNumber = super.getAccountNumber() +"-" +savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		
		super(oldAccount, amount);
		savingsNumber = oldAccount.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber()+"-" +savingsNumber;
	}
	
	public void postInterest(){
		
		double balanceWithInterest;
		
		balanceWithInterest = getBalance() * rate/12;
		
		deposit(balanceWithInterest);
	}
	
	public String getAccountNumber(){
		
		return accountNumber;
	}
}
