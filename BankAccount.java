/**
 * Represents a bank account of a cerain type with a balance and owner social security number
 * @author 
 *
 */
public class BankAccount {
	
	private int balance;
	private String ownerSSN; 	//social security num of owner
	private String accountType; 	//may be "checking" or "savings"
	

	/**
	 * Default, no-args constructor
	 */
	public BankAccount() { 
	}
	
	/**
	 * Makes a deposit by adding the amount to the balance 
	 * @param d amount being deposited 
	 */
	public void makeDeposit(int d) {
		balance = balance + d;
	}
	
	/**
	 * Makes a withdrawl by subtracting the amount from the balance 
	 * @param w amount being withdrawn 
	 */
	public void makeWithdrawal(int w) {
		balance = balance - w;
	}
	
	/**
	 * Sets the balance of the account
	 * @param newBalance balance of the account
	 */
	public void setBalance(int newBalance) {
		balance = newBalance;
	}
	
	/**
	 * Gets the balance of the account
	 * @return the balance of the account
	 */
	public int getBalance() {
		return balance;
	}
	
	/**
	 * Sets the social security number associated with the account
	 * @param o social security number
	 */
	public void setOwnerSSN(String o) {
		ownerSSN = o;
	}
	
	/**
	 * Gets the owner's social security number
	 * @return the owners social security number
	 */
	public String getOwnerSSN() {
		return ownerSSN;
	}
	
	/**
	 * Sets the type of bank account
	 * @param o the type of bank account
	 */
	public void setAccountType(String a) {
		accountType = a;
	}
	
	/**
	 * Gets the type of bank account
	 * @return the type of bank account
	 */
	public String getAccountType() {
		return accountType;
	}
	
	
}
