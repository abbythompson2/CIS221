
// Bank Account Class
// Abby Thompson 10 / 31 / 2023

class BankAccountException extends Exception {

    public BankAccountException(String errorMessage) {
        super(errorMessage);
    }
}



public class BankAccount {
	
    private int balance;

    
    public BankAccount() {
        this.balance = 0;
    }

    
    public int getTotal() {
        return balance;
    }
    
    
    public void withdraw(int amount) throws BankAccountException {
        if (amount > balance) {
            throw new BankAccountException("There are insufficient funds for withdrawal.");
            }
        if (amount < 0) {
            throw new BankAccountException("Withdrawal amount cannot be negative.");
            }
        else{
        	balance -= amount;       	
        }
    }

    
    public void deposit(int amount) throws BankAccountException {
        if (amount < 0) {
            throw new BankAccountException("Deposit amount cannot be negative.");
        }
        else {
        balance += amount;
        }
    }

 
    
    public String toString() {
        return "Account balance: $" + balance;
    }
}




