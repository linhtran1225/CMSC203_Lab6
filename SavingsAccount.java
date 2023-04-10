
public class SavingsAccount extends BankAccount{
	double rate = 0.025;
	int savingsNumber = 0;
	String accountNumber;
	public SavingsAccount(String name, double balance) {
		super(name, balance);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public SavingsAccount(SavingsAccount sAcc, int balance) {
		super(sAcc, balance);
		this.savingsNumber = sAcc.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	public void postInterest() {
		double interestPMonth = (this.getBalance()*rate)/12;
		this.setBalance(this.getBalance() + interestPMonth);
	}
}
