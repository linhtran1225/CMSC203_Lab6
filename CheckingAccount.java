
public class CheckingAccount extends BankAccount{
	public static final double FEE = 0.15;
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber()+"-10");
	}
	@Override
	public boolean withdraw(double amount) {
		boolean check = true;
		if (!(super.withdraw(amount + FEE) == true)) {
			check = false;
		}
		return check;
	}
}
