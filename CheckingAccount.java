/**
 * Represents a checking account that has a minimum balance and a certain monthly fee
 * @author 
 *
 */
public class CheckingAccount extends BankAccount {
	
	private int minBalance;
	private int monthlyFee;
	
	/**
	 * Constructor that sets the account type to checking account 
	 */
	public CheckingAccount() {
		setAccountType("checking");
	}

	/**
	 * Sets the minimum balance of the account
	 * @param m minimum balance
	 */
	public void setMinBalance(int m) {
		minBalance = m;
	}

	/**
	 * Gets the minimum balance of the account
	 * @return the minimum balance
	 */
	public int getMinBalance() {
		return minBalance;
	}

	/**
	 * Sets the monthly fee of the account
	 * @param m monthly fee
	 */
	public void setMonthlyFee(int m) {
		monthlyFee = m;
	}

	/**
	 * Gets the monthly fee of the account
	 * @return the monthly fee
	 */
	public int getMonthlyFee() {
		return monthlyFee;
	}

}
