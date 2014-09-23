/**
 * Represents a savings account with a certain interest rate and maximum number of withdrawls it can have
 * @author 
 *
 */
public class SavingsAccount extends BankAccount {
	
	private int interestRate;
	private int maxNumWithdrawals;
	
	/**
	 * Constructor that sets the account type to savings account
	 */
	public SavingsAccount() {
		setAccountType("savings");
	}

	/**
	 * Sets the interest rate of the account
	 * @param i interest rate
	 */
	public void setInterestRate(int i) {
		interestRate = i;
	}

	/**
	 * Gets the interest rate of the account
	 * @return the interest rate
	 */
	public int getInterestRate() {
		return interestRate;
	}

	/**
	 * Sets the maximum number of withdrawls the account can have
	 * @param m maximum number of withdrawls
	 */
	public void setMaxNumWithdrawals(int m) {
		maxNumWithdrawals = m;
	}

	/**
	 * Gets the maximum number of withdrawls
	 * @return the maximum number of withdrawls
	 */
	public int getMaxNumWithdrawals() {
		return maxNumWithdrawals;
	}

}
