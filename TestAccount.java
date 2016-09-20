/**
 * Created by mfcobo on 9/13/16.
 */
 public class TestAccount{
	public static void main(String[] args){
	 // Test constructor and toString()
		Account account = new Account(201504638);
		System.out.println(account);
		Account newAccount = new Account(201504638,100.00);
		System.out.println(newAccount); //toString()
		
	// Test Setters and Getters
      newAccount.setBalance(999.99);
      System.out.println(newAccount);  // run toString() to inspect the modified instance
      System.out.println("Account number is: " + newAccount.getAccountNumber());
      System.out.println("Balance is: " + newAccount.getBalance());
	
	// Test credit and debit
		newAccount.credit(100.00);
		newAccount.debit(500.00);
		System.out.println(newAccount);
		
		}
 }