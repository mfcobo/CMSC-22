/**
 * Created by mfcobo on 9/13/16.
 */
 public class Account{
	 private int accountNumber;
	 private double balance;
	 Account(int accountNumber, double balance){
		 this.accountNumber = accountNumber;
		 this.balance = balance;
	 }
	 Account(int accountNumber){
		 this(accountNumber,0.0);
	 }
	 public int getAccountNumber(){
		 return accountNumber;
	 }
	 public double getBalance(){
		 return balance;
	 }
	 public void setBalance(double balance){
		 this.balance = balance;
	 }
	 public void credit(double amount){
		 balance += amount;
	 }
	 public void debit(double amount){
		 if(balance < amount){
			 throw new IllegalArgumentException("Amount withdrawn  exceeds the current balance!");
		 }
		 balance -= amount;
	 } 
	 public String toString(){
		 return String.format("A/C no:%d, Balance = $%.2f", accountNumber, balance);
	 }
 }
